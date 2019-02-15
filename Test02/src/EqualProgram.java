import java.util.Scanner;

public class EqualProgram {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int inputInt, tenPosi, onePosi = 0;
		
		System.out.println("2자리수 정수 입력(10~99)>>");
		inputInt = in.nextInt();
		tenPosi = inputInt / 10;
		onePosi = inputInt % 10;
		if(tenPosi == onePosi) 
			System.out.println("Yes! 10의 자리와 1의 자리가 같댜");
		else
			System.out.println("10자리랑 1자리 다름 ㅋ");
				
	}
}
