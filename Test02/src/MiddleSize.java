import java.util.Scanner;

public class MiddleSize {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arrayInt[] = new int[3];
		
		System.out.println("정수 3개 입력쓰>>");
		for(int i = 0;i < 3;i++) 
			arrayInt[i] = in.nextInt();
		if(arrayInt[0] > arrayInt[1]) {
			if(arrayInt[1] > arrayInt[2])
				System.out.println("중간 값은 " + arrayInt[1]);
			else if(arrayInt[0] > arrayInt[2])
				System.out.println("중간 값은 " + arrayInt[2]);
			else
				System.out.println("중간 값은 " + arrayInt[0]);
		}
		else {
			if(arrayInt[0] > arrayInt[2])
				System.out.println("중간 값은 " + arrayInt[0]);
			else if (arrayInt[1] > arrayInt[2])
				System.out.println("중간 값은 " + arrayInt[2]);
			else
				System.out.println("중간 값은 " + arrayInt[1]);
		}
		}
	}


