import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int month = 0;
		
		System.out.println("달을 입력해보시지(1~12) >> ");
		month = in.nextInt();
		
		if (month <= 5 && month >= 3)
			System.out.println("봄임 ㅋ");
		else if (month <= 8 && month >= 6)
			System.out.println("여름임 ㅋ");
		else if (month <= 11 && month >= 9)
			System.out.println("봄가을임 ㅋ");
		else 
			System.out.println("겨울임 ㅋ");
		
		switch (month) {
			case 3:
			case 4:
			case 5:
				System.out.println("봄임 ㅋ"); break;
			case 6:
			case 7:
			case 8:
				System.out.println("여름임 ㅋ"); break;
			case 9:
			case 10:
			case 11:
				System.out.println("가울임 ㅋ"); break;
			case 12:
			case 1:
			case 2:
				System.out.println("겨울임 ㅋ"); break;
		}
	}

}
