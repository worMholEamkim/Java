import java.util.Scanner;

public class EX05_MAIN {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		EX05_Circle c[] = new EX05_Circle[3];
		
		for(int i=0;i<c.length; i++) 
		{
			System.out.print("x, y, radius >>");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			
//			c[i] = new EX05_Circle(x,y,radius);
			
//			c[1] = new EX05_Circle(x,y,radius);
//			c[2] = new EX05_Circle(x,y,radius);
				
//			c[i] = new EX05_Circle();
//			c[i].setX(x);
//			c[i].setY(y);
//			c[i].setRadius(radius);
			
			c[i] = new EX05_Circle();
			c[i].setAll(x,y,radius);
			
		}
		
//		for(int i=0; i<c.length; i++) 
//			c[i].show();
		
//		double max=0.0;
//		int max_index=0;
//		
//		for(int i=0; i<c.length; i++)
//		{
//			if(max < c[i].getArea())
//			{
//				max = c[i].getArea();
//				max_index = i;
//			}
//		}
		
//		double max=0.0;
		int max_index=0;
		
		for(int i=0; i<c.length; i++)
		{
			if(c[max_index].getArea() < c[i].getArea())
			{
				//max = c[i].getArea();
				max_index = i;
			}
		}
		
		System.out.print("°¡Àå Å« ³à¼®->");
		c[max_index].show();
		
		
		
		sc.close();

	}

}
