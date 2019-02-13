import java.util.Scanner;

public class Test05 {
public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int array[]= new int[10];
		System.out.print("양의 정수 10개를 입력하쇼>>");
		
		for(int i=0;i<10;i++) {	
			array[i] = in.nextInt();
			
	}
		System.out.print("3의 배수는");
		for(int j=0;j<10;j++) {
			if (array[j] % 3 == 0) {
				System.out.print(array[j]);
				System.out.print(" ");
				
		}
			
}

}}
