
public class TEST05_Circle {
	private double x;
	double y;
	private int radius;
	
	TEST05_Circle(double x1, double y1, int radius1){
		x = x1;
		y = y1;
		radius = radius1;
	}
	
	public double Area() {
		return 3.14 * radius * radius;
	}
	
	public void show() {
		System.out.println("(" + x + ", " + y + ")" + radius);
	}
}
