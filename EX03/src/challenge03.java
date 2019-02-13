import java.util.Scanner;
import java.util.Random;

public class challenge03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random rd = new Random();
		
		
		int random = rd.nextInt(100);
		System.out.println("수를 결정하였습니다. 맞추어 보세요. 0-99");
		aa:
		for(int i = 0;i<100;i++) {
			System.out.print(i+">>");
			int solve = in.nextInt();
			if  (random > solve)
				System.out.println("더 높게");
			else if (random < solve)
				System.out.println("더 낮게");
			else {
				System.out.println("맞았습니다.");
				System.out.println("다시하시겠습니까(y/n)>>");
				String regame = in.next();
				if (regame == "y") 
					continue aa;
				else if( regame == "n")
					break aa;
			}
		
			
	}
	}
}

