import java.util.Scanner;

public class TEST02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ ������ 3���� ���� �Է¾�>> ");
		int korean = sc.nextInt();
		int english = sc.nextInt();
		int math = sc.nextInt();
		
		TEST02_Grade me = new TEST02_Grade(korean, english, math);
		System.out.println("��տ� " + me.average());
		
		sc.close();
	}

}
