import java.util.Scanner;

public class TEST05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TEST05_Circle c[] = new TEST05_Circle[3];
		for(int i=0; i<c.length; i++) {
			
			System.out.print("x, y, radius >>");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i] = new TEST05_Circle(x, y, radius);
			
		}
		for(int i=0; i<c.length; i++ )
			c[i].show();
		
		double doubleArea [] = new double[3];
		for(int i=0; i<c.length; i++ )
			doubleArea[i] = c[i].Area();
		
		for(int i=0; i<c.length; i++) {
			for(int j=i; j<c.length; j++) {
				if (doubleArea[j + 1] < doubleArea[i])
					System.out.print("가장 면적이 큰 원은 (" + c[i].x + ", " + c[i].y + ")" + c[i].radius );
				else
					j++;
			}
		}
		
		
		sc.close();
	}
	
}
