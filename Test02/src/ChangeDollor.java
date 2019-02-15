import java.util.Scanner;

public class ChangeDollor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int won = 0;
		
		System.out.println("원화를 입력하시요(단위원)>>");
		won = in.nextInt();
		System.out.println(won +"원은 $" + won/1100.0 +"입니다.");
	}

}
