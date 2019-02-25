import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TE01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		System.out.println("전화번호 입력 프로그램인데");
		try {
			fout = new FileWriter("c:\\Users\\it\\phone.txt");
			while(true) {
				System.out.print("이름 전화번호 >>");
				String line = sc.nextLine();
				if(line.length() == 0)
					break;
				fout.write(line, 0, line.length());
				fout.write("\r\n", 0, 2);
			}
			fout.close();
			
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
		System.out.println("c:\\Users\\it\\phone.txt에 저장하였다.");
		sc.close();
	}

}
