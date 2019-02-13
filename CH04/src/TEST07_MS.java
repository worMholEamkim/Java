import java.util.Scanner;
public class TEST07_MS {
	
	
	TEST07_Day[] day_arr; //��ü�迭
	int count_day; //��ü�ϼ�
	Scanner sc;
	
	public TEST07_MS(int count_day)
	{
		this.count_day = count_day;
		day_arr = new TEST07_Day[count_day];
		for(int i=0; i<day_arr.length;++i)
			day_arr[i] = new TEST07_Day();
	
		Scanner sc = new Scanner(System.in);
	}
	

	public void input() {
		System.out.print("��¥(1~30)?");
		int day = sc.nextInt(); //Ư�� ��¥ �Է� ����
		System.out.print("�� ��(��ĭ���� �Է�)?");
		String work = sc.next(); //Ư�� ��¥�� �� ��
		
		day--; //day = day - 1;
		day_arr[day].set(work);
		
		if(day<0 || day>count_day) {
			System.out.println("��¥�� �߸��Է��ϼ˾�.");
		}
	} 
	
	public void view() {
		 System.out.print("��¥(1~30)?");
		 int day = sc.nextInt();//Ư�� ��¥ �Է� ����(������ �ϴ�)
		 
		 day--; //�迭�� 0 �ε����� �����ֱ� ���ؼ�
		 
		 System.out.print((day+1) + "���� �� ���� ");
		 day_arr[day].show();
	}
	
	public void finish() {
		sc.close();
		System.out.println("���α׷��� �����մϴ�.");
	}
	
	public void run() {
		System.out.println("�̹��� ������ ���� ���α׷�");
		while(true) {
			System.out.print("����(�Է�:1, ����:2, ������:3) >>");
			int option = sc.nextInt();
//			if(option == 1)
//				input();
//			else if(option == 2)
//				view();
//			else if(option == 3)
//				finish();
			
			switch(option) {
			case 1:
				input();
				break;
			case 2:
				view();
			case 3:
				finish();
				return;
			default:
				System.out.println("(1~3)���̸� �Է����ּ���. ");
			}
		}
	
	
	}


}
