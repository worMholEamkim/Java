import java.util.Vector;

class Point {
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}


public String toSting() {
	return "(" + x + ", " + y + ")";
}
}

public class EX02 {
	
	public static void main(String[] args) {	
		Vector <Point> v = new Vector <Point> ();
		
		v.add(new Point(2, 3));
		v.add(new Point(-5, 20));
		v.add(new Point(30, -8));
		
		v.remove(1); //¿Œµ¶Ω∫ 1¿« Point(-5, 20) ∞¥√º ªË¡¶
		
		for(int i=0; i<v.size(); i++) {
			Point p = v.get(i);
			System.out.println(p.toString());
		}
	}

}
