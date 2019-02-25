import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class EX07 {

	public static void main(String[] args) {
		FileReader fin = null;
		int c;
		
		try {
			fin = new FileReader("c:\\Temp\\test2.txt");
			BufferedOutputStream(System.out, 5);
			while(( c = fin.read() != -1)) {
				out.write(c);
			}
			new Scanner(System.in).nextLine();
			out.flush();
			fin.close();
			out.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}


}
