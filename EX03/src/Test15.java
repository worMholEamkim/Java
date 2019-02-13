import java.util.Scanner;
import java.util.InputMismatchException;

public class Test15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("곱하고자 하는 두 수 입력>>");
		do {
		try {
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		System.out.println(n + "x" + m + "=" + n*m);
		break; //반복끝
		}
		catch(InputMismatchException e) {
			System.out.println("실수는 입력하면 안됩니다.");
			continue;
			
		}
		
		}while(true);
		
		scanner.close();
		
		
	}

}
