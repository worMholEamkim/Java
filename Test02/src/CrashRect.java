import java.util.Scanner;



public class CrashRect {
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) 
	{
		if((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
			return true;
		else 
			return false;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1, y1, x2, y2 = 0;
		boolean first, second;
		System.out.println("(x1, y1)와 (x2, y2)을 입력하세영>>");
		x1 = in.nextInt();
		y1 = in.nextInt();
		x2 = in.nextInt();
		y2 = in.nextInt();
		
		first = inRect(x1, y1, 100, 100, 200, 200);
		second = inRect(x2, y2, 100, 100, 200, 200);
		
		if(first&&second)
			System.out.println("두 점 (x1, y1) (x2, y2)는 충돌합니댜");
		else if(first||second)
			System.out.println("두 점 (x1, y1) (x2, y2)는 충돌합니댜");
		else if(first||second == false)
			System.out.println("두 점 (x1, y1) (x2, y2)는 충돌안해버렷");		
	}

}
