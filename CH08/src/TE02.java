import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class TE02 {

	public static void main(String[] args) {
		FileReader fin = null;
		int c;
		try {
//			File f = new File("c:\\Users\\it\\phone.txt");
//			FileReader fr = new FileReader(f);
			fin = new FileReader("c:\\Users\\it\\phone.txt");
			BufferedOutputStream out = new BufferedOutputStream(System.out, 40);
			while((c = fin.read()) != -1) {
				out.write(c);
			}
			fin.close();
			out.close();
			
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
		System.out.println("c:\\Users\\it\\phone.txt에 출력");
	}

}
