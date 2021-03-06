
import java.util.Scanner;

public class TEST08_PhoneBook {
	TEST08_Phone[] phone_arr;
	
	Scanner sc;
	
	
	//생성자
	public TEST08_PhoneBook() {
		sc = new Scanner(System.in);
		
		
	}
	
	public void input(){
		System.out.print("인원수>>");
		int member = sc.nextInt();
		for(int i=0;i<member; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			String name = sc.next();
			String tel = sc.next();
			phone_arr[i] = new TEST08_Phone(name, tel);
			
		}
		
		System.out.println("저장되었습니다...");
	}
	
	public String search(String name){
		
		
		for(int i=0;i<phone_arr.length; i++) {
			if(name.equals(phone_arr[i].getName())) {
				return phone_arr[i].getTel();
		}
		}
			return null;
		}
	
	public void run() {
		input();
		
		while(true) {
			System.out.print("검색할 이름>>");
			String name = sc.next();
			
			if(name.equals("그만"))
				break;
		
			String tel = search(name);
			
			if(tel == null)
				System.out.println(name + "없습니다.");
			else
				System.out.println(name + "의 번호는" + tel + "입니댜.");
		}
		sc.close();
	}
	
}
