import java.util.Scanner;

public class RockSicssorsPaper {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String draw1, draw2;
	System.out.println("가위바위보 게임이야. 가위, 바위, 보 중에서 입력행");
	System.out.println("철수 >>");
	draw1 = in.next();
	System.out.println("영희 >>");
	draw2 = in.next();
	
	if(draw1.equals(draw2))
		System.out.println("철수랑 영히 비겻네 ㅋ");
	else if(draw1.equals("가위")) {
		if(draw2.equals("바위")) 
			System.out.println("영히가 이김 ㅋ");
		else if(draw2.equals("보")) 
			System.out.println("철수가 이김 ㅋ");
		}
	else if(draw1.equals("바위")) {
		if(draw2.equals("보")) 
			System.out.println("영히가 이김 ㅋ");
		else if(draw2.equals("가위")) 
			System.out.println("철수가 이김 ㅋ");
		}
	else if(draw1.equals("보")) {
		if(draw2.equals("가위")) 
			System.out.println("영히가 이김 ㅋ");
		else if(draw2.equals("바위")) 
			System.out.println("철수가 이김 ㅋ");
		}	
}
}