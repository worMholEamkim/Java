import java.util.Scanner;

public class TEST03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		TEST03_SONG song[] = new TEST03_SONG[5];
		for(int i=0; i<song.length; i++)
		{
			System.out.print("(5��)�����Է�>> ");
			song[i].title = sc.next();
			System.out.print("(5��)�����Է�>> ");
			song[i].artist = sc.next();
			System.out.print("(5��)�����Է�>> ");
			song[i].year = sc.nextInt();
			System.out.print("(5��)�����Է�>> ");
			song[i].country = sc.next();
			song[i] = new TEST03_SONG();
		}
		for(int i=0; i<song.length; i++)
			song[i].show();
	}

}
