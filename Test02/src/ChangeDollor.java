import java.util.Scanner;

public class ChangeDollor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int won = 0;
		
		System.out.println("��ȭ�� �Է��Ͻÿ�(������)>>");
		won = in.nextInt();
		System.out.println(won +"���� $" + won/1100.0 +"�Դϴ�.");
	}

}