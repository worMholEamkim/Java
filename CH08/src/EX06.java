import java.io.FileInputStream;
import java.io.IOException;

public class EX06 {

	public static void main(String[] args) {
		byte b[] = new byte[6];
		try {
		FileInputStream fin = new FileInputStream("w:\\Temp\\test.out");
		
		int n = 0, c;
		while((c = fin.read()) != -1) {
			b[n] = (byte)c;
			n++;
			
		}
		System.out.println("c:\\Temp\\test.out에서 읽은 배열을 출력함");
		for(int i=0; i<b.length; i++)System.out.println(b[i] + " ");
		System.out.println();
		fin.close();
	}catch(IOException e) {
		System.out.println("c:\\Temp\\Test.out에서 ㅇ리깆못햇다 경로명다시봐");
	
	}
	

	}}
