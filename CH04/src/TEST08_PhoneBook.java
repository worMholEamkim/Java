
import java.util.Scanner;

public class TEST08_PhoneBook {
	TEST08_Phone[] phone_arr;
	
	Scanner sc;
	
	
	//������
	public TEST08_PhoneBook() {
		sc = new Scanner(System.in);
		
		
	}
	
	public void input(){
		System.out.print("�ο���>>");
		int member = sc.nextInt();
		for(int i=0;i<member; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			String name = sc.next();
			String tel = sc.next();
			phone_arr[i] = new TEST08_Phone(name, tel);
			
		}
		
		System.out.println("����Ǿ����ϴ�...");
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
			System.out.print("�˻��� �̸�>>");
			String name = sc.next();
			
			if(name.equals("�׸�"))
				break;
		
			String tel = search(name);
			
			if(tel == null)
				System.out.println(name + "�����ϴ�.");
			else
				System.out.println(name + "�� ��ȣ��" + tel + "�Դϴ�.");
		}
		sc.close();
	}
	
}