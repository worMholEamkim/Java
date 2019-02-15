import java.util.Scanner;

public class ClapClap {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int hund = 0;
		
		
		System.out.println("1~99 »çÀÌÀÇ Á¤¼ö¸¦ ÀÔ·ÂÇØºÁ>>");
		hund = in.nextInt();
		int tenPosi = hund / 10;
		int onePosi = hund % 10;
		if((tenPosi % 3 == 0 )&&(onePosi % 3 == 0))
			System.out.println("¹Ú¼öÂ¦Â¦¾²");
		else if((tenPosi % 3 == 0 )||(onePosi % 3 == 0))
			System.out.println("¹Ú¼öÂ¦¾²");
		else
			System.out.println("Ç±");
		
	}
	
}
