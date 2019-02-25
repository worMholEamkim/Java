import java.io.FileOutputStream;
import java.io.IOException;

public class EX05 {

	public static void main(String[] args) {
		byte b[] = {7, 51, 3, 4, -1, 24};
		try {
			FileOutputStream fout = new FileOutputStream("c:\\test.out");
			for(int i=0; i<b.length; i++)
				fout.write(b[i]);
			fout.close();
		}catch(IOException e) {
			System.out.println("c:\\Temp\\test.out에 저장할 수 없었습니다. 경로명을 확인해봐");
			
			return;
		}
		System.out.println("c:\\Temp\\test.out을 저장했댜");
	}

}
