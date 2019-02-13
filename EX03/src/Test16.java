import java.util.Scanner;


public class Test16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String com[] = {"가위", "바위", "보"};
		
		while(true) {
			System.out.print("가위, 바위, 보 입력(사용자)>>");
			String user = sc.nextLine();
			
			if(user.equals("그만"))
			{
				System.out.println("게임을 종료합니다.");
				break;
				
			}
			int index = (int)(Math.random()*3);
			String strCom = com[index];
			
			System.out.println("나는" + user);
			System.out.println("컴은" + strCom);
			
			if(user.equals("가위"))
			{
				if(strCom.equals("가위"))
					System.out.println("비김");
				else if(strCom.equals("바위"))
					System.out.println("짐 ㅠ");
				else if(strCom.equals("보"))
					System.out.println("이김!");
			
			}
			
			else if(user.equals("바위"))
			{
				if(strCom.equals("가위"))
					System.out.println("이김!");
				else if(strCom.equals("바위"))
					System.out.println("비김");
				else if(strCom.equals("보"))
					System.out.println("짐ㅠㅠ");
			
			}
			
			else if(user.equals("보"))
			{
				if(strCom.equals("가위"))
					System.out.println("짐 ㅠ");
				else if(strCom.equals("바위"))
					System.out.println("이김!");
				else if(strCom.equals("보"))
					System.out.println("짐 ㅠ");
			
			}
		
		}
		
		
		
		
		
	}

}
