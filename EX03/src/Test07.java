import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int intArray[] = new int[10];
		int sum = 0;
		System.out.print("·£´ýÇÑ Á¤¼öµé");
		for(int i=0;i<intArray.length;i++) { 
			intArray[i] = (int)(Math.random()*10 + 1);
			sum += intArray[i];
			System.out.print(intArray[i]);
		}
		System.out.println("Æò±ÕÀº" + sum/intArray.length);
		
	}	

}
