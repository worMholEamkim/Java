
public class TEST04_Rectangle {
	int x, y, width, height;
	
	public TEST04_Rectangle(int x1, int y1, int width1, int height1) {
		x = x1;
		y = y1;
		width = width1;
		height = height1;
	}
	
	public int square() {
		return width * height;
	}
	
	public void show() {
		System.out.println("(" + x + ", " + y + ")���� ũ�Ⱑ " + width + "x" + height + "�� �簢��");
		
	}
	
	public boolean contains(TEST04_Rectangle r) {
		if( ((r.x - r.width) < x) && ((r.x + r.width) > x))
			if( ((r.y - r.width) < y) && ((r.y + r.width) > y))
				return true;
			else
				return false;
		return false;
	}
	
	
}