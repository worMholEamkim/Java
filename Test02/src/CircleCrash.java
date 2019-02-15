import java.util.Scanner;

public class CircleCrash {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double firX, firY, firRad, secX, secY, secRad = 0.0;
		
		System.out.println("첫 번째 원의 중심과 반지름 입력 ㄱㄱ>>");
		firX = in.nextInt();
		firY = in.nextInt();
		firRad = in.nextInt();
	
		System.out.println("두 번째 원의 중심과 반지름 입력 ㄱㄱ>>");
		secX = in.nextInt();
		secY = in.nextInt();
		secRad = in.nextInt();
		
		if( Math.sqrt(Math.pow(Math.abs(firY - secY), 2) + Math.pow(Math.abs(firX - secX), 2)) <= (firRad + secRad))
			System.out.println("두 원은 겹칩니데이");
		else
			System.out.println("안 겹침 ㅅㄱ");
			
		
	
	}

}