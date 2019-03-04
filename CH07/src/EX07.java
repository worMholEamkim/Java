import java.util.HashMap;
import java.util.Scanner;

public class EX07 {

	class Student{
		int id;
		String tel;
		public Student(int id, String tel) {
			this.id = id;
			this.tel = tel;
		}
	}
	
	
	
	public static void main(String[] args) {
		HashMap <String, Student> map = new HashMap <String, Student>();
		
		map.put("황기태", new Student(1, "010-1111-1111"));
		map.put("김새암", new Student(2, "010-2223-3333"));
		map.put("이채런", new Student(3, "010-4444-1111"));
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("검색할 이름?");
			String name = sc.nextLine();
			if(name.equals("exit"))
				break;
			Student student = map.get(name);
			
			if(student == null)
				System.out.println(name + "은 없는 사람입니다.");
			else
				System.out.println("id:" + student.getId() + ", 전화:" + student.getTel());
		}
		sc.close();
		}
	}


