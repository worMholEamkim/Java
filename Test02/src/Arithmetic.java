import java.util.Scanner;

public class Arithmetic {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x, y;
		String arith;
		
		System.out.println("연산 입력 ㄱㄱ>>");
		x = in.nextInt();
		arith = in.next();
		y = in.nextInt();
		
		if (arith.equals("*"))
			System.out.println(x + arith + y + "의 계산 결과는 " + (x*y) );
		else if (arith.equals("+"))
			System.out.println(x + arith + y + "의 계산 결과는 " + (x+y) );
		else if (arith.equals("-"))
			System.out.println(x + arith + y + "의 계산 결과는 " + (x-y) );
		else 
			System.out.println(x + arith + y + "의 계산 결과는 " + (x/y) );
	
		switch (arith) {
			case "*":
				System.out.println(x + arith + y + "의 계산 결과는 " + (x*y) ); break;
			case "+":
				System.out.println(x + arith + y + "의 계산 결과는 " + (x+y) ); break;
			case "-":
				System.out.println(x + arith + y + "의 계산 결과는 " + (x-y) ); break;
			case "/":
				System.out.println(x + arith + y + "의 계산 결과는 " + (x/y) ); break;
				
		}
	}
}
