import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TE01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		System.out.println("��ȭ��ȣ �Է� ���α׷��ε�");
		try {
			fout = new FileWriter("c:\\Users\\it\\phone.txt");
			while(true) {
				System.out.print("�̸� ��ȭ��ȣ >>");
				String line = sc.nextLine();
				if(line.length() == 0)
					break;
				fout.write(line, 0, line.length());
				fout.write("\r\n", 0, 2);
			}
			fout.close();
			
		}catch(IOException e) {
			System.out.println("����� ����");
		}
		System.out.println("c:\\Users\\it\\phone.txt�� �����Ͽ���.");
		sc.close();
	}

}
