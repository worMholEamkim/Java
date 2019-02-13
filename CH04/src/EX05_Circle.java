
public class EX05_Circle 
{
	private double x, y;	
	private int radius;
//	static final double PI = 3.14;
	
	public EX05_Circle() 
	{
		
	}

	public EX05_Circle(double x, double y, int radius) 
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void setAll(double x, double y, int radius ) 
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
		
	}

	public void show() {
		System.out.println("(" + this.x + "," + y + ")"+ radius);
	}
	
	public double getArea()
	{
		double area=0;
		area = Math.PI * radius * radius;
		return area;
	}


		
	
	

}
