import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = 0;
		
		
		do {
			System.out.print("정수 몇개?");
			count = in.nextInt();
		}while(count <= 0 || count > 100);
		
		int arr[] = new int[count];
		aa:
		for(int i = 0;i<arr.length;++i) {
			int check = (int)(Math.random()*100+1);
			for(int j=0;j<i;j++) {
				if (arr[i] == check)
					i--;
				continue aa;
			}
			arr[i] = check;
		}
		
		for(int i = 0;i<arr.length;++i) {
			System.out.println(arr[i] + " ");
			if(i % 10 == 0)
				System.out.println("");
		
	}
	}
			
	}


