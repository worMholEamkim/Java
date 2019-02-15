import java.util.Scanner;

public class Rectanglar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int loc[] = new int[2];
		
		System.out.println("점 (x,y)의 좌표를 입력하시바>>");
		for(int i = 0;i < 2;i++)
			loc[i] = in.nextInt();
		
		if(100<loc[0] && 200>loc[0]) {
			if(100<loc[1] && 200>loc[1])
				System.out.println("("+loc[0]+","+loc[1]+") 는 사각형 안에 있습니댜");
			else 
				System.out.println("("+loc[0]+","+loc[1]+") 는 사각형 안에 없어 샹");
		}		
		else if(100<loc[1] && 200>loc[1]) {
			if(100<loc[0] && 200>loc[0])
				System.out.println("("+loc[0]+","+loc[1]+") 는 사각형 안에 있습니댜");
			else 
				System.out.println("("+loc[0]+","+loc[1]+") 는 사각형 안에 없어 샹");
		}
		else
			System.out.println("("+loc[0]+","+loc[1]+") 는 사각형 안에 없어 샹");
		
				
	}

}
