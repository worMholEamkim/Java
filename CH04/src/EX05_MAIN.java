import java.util.Scanner;

public class EX05_MAIN {

	public static void main(String[] args) {
		EX05_Book [] javaBook = new EX05_Book[2];
		Scanner s = new Scanner(System.in);
		for(int i=0; i<javaBook.length; i++) {
			System.out.print("����>>");
			String title = s.next();
			System.out.print("����>>");
			String author = s.next();
			
			javaBook[i] = new EX05_Book(title, author);
		}
		
		for(int i = 0; i<javaBook.length; i++)
			System.out.println("(" + javaBook[i].title + ", " + javaBook[i].author + ")");
		
		s.close();
	}

}
