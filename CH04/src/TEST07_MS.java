import java.util.Scanner;
public class TEST07_MS {
	
	
	TEST07_Day[] day_arr; //객체배열
	int count_day; //전체일수
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
		System.out.print("날짜(1~30)?");
		int day = sc.nextInt(); //특정 날짜 입력 받음
		System.out.print("할 일(빈칸없이 입력)?");
		String work = sc.next(); //특정 날짜에 할 일
		
		day--; //day = day - 1;
		day_arr[day].set(work);
		
		if(day<0 || day>count_day) {
			System.out.println("날짜를 잘못입력하셧어.");
		}
	} 
	
	public void view() {
		 System.out.print("날짜(1~30)?");
		 int day = sc.nextInt();//특정 날짜 입력 받음(보고자 하는)
		 
		 day--; //배열의 0 인덱스와 맞춰주기 위해서
		 
		 System.out.print((day+1) + "일의 할 일은 ");
		 day_arr[day].show();
	}
	
	public void finish() {
		sc.close();
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void run() {
		System.out.println("이번달 스케쥴 관리 프로그램");
		while(true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
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
				System.out.println("(1~3)사이를 입력해주세요. ");
			}
		}
	
	
	}


}

