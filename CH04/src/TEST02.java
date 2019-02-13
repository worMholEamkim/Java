import java.util.Scanner;

public class TEST02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국영수 순으로 3개의 점수 입력쓰>> ");
		int korean = sc.nextInt();
		int english = sc.nextInt();
		int math = sc.nextInt();
		
		TEST02_Grade me = new TEST02_Grade(korean, english, math);
		System.out.println("평균운 " + me.average());
		
		sc.close();
	}

}
