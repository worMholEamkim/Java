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
		
		map.put("Ȳ����", new Student(1, "010-1111-1111"));
		map.put("�����", new Student(2, "010-2223-3333"));
		map.put("��ä��", new Student(3, "010-4444-1111"));
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("�˻��� �̸�?");
			String name = sc.nextLine();
			if(name.equals("exit"))
				break;
			Student student = map.get(name);
			
			if(student == null)
				System.out.println(name + "�� ���� ����Դϴ�.");
			else
				System.out.println("id:" + student.getId() + ", ��ȭ:" + student.getTel());
		}
		sc.close();
		}
	}


