import java.util.Scanner;

public class Tryangle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int line[] = new int[3]; 
		
		System.out.println("정수 3개를 입력하시요>>");
		
		for(int i = 0;i < 3;i++) {
			line[i] = in.nextInt();
		}
		//작은 두변의 합이 나머지 한변의 길이보다 길어야함
		if(line[0] < line[2]||line[1] < line[2]) {
			if(line[0] + line[1] > line[2])
				System.out.println("이게 삼각형이 되네?");
			else
				System.out.println("삼각형 안된 ㄴㄴㄴ 저리가 안됨");
		}
		else if(line[0] < line[1]||line[2] < line[1]) {
			if(line[0] + line[2] > line[1])
				System.out.println("이게 삼각형이 되네?");
			else
				System.out.println("삼각형 안된 ㄴㄴㄴ 저리가 안됨");
		}
		else if(line[1] < line[0]||line[2] < line[0]) {
			if(line[1] + line[2] > line[0])
				System.out.println("이게 삼각형이 되네?");
			else
				System.out.println("삼각형 안된 ㄴㄴㄴ 저리가 안됨");
		}
	}
			
}

