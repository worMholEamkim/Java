import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double centerX, centerY, radius = 0.0;
		int pointX, pointY = 0;
		
		System.out.println("원의 중심과 반지름 입력해 좋은말할때>>");
		centerX = in.nextInt();
		centerY = in.nextInt();
		radius = in.nextInt();
		
		System.out.println("점 입력>>");
		pointX = in.nextInt();
		pointY = in.nextInt();
		
		if(radius >= Math.sqrt(Math.pow(Math.abs(pointY-centerY), 2) + Math.pow(Math.abs(pointX - centerX), 2)))
			System.out.println("점 ("+ pointX + ", " + pointY + ")는 원 안에 있슴");
		else
			System.out.println("원 안에 없으셈");
	}

}
