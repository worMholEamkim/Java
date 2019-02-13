
public class test13 {

	public static void main(String[] args) {
			
		for(int i=1; i<100; i++) {
			if ((i > 10) && (i / 10) % 3 == 0) 
				if((i % 10) % 3 == 0)
					System.out.println(i + " ¹Ú¼ö Â¦Â¦¾²");
				else
					System.out.println(i + " ¹Ú¼ö Â¦");
			else if ((i % 10 != 0) && (i % 10) % 3 == 0)
				System.out.println(i + " ¹Ú¼ö Â¦");
		
	}
	}
}
