import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) 
	{
		FileWriter fw;
		Scanner scanner;
		File f;
		
		try {
			f = new File("c:\\temp\\phone.txt");
			fw = new FileWriter(f);
			scanner = new Scanner(System.in);			
			
			System.out.println("��ȭ��ȣ �Է� ���α׷��Դϴ�.");
			while(true) {
				System.out.print("�̸� ��ȭ��ȣ >> ");
				String line = scanner.nextLine(); // ������ �д´�.
				if(line.equals("�׸�"))
						break; // �Է� ����
				fw.write(line+"\r\n"); // �� �� ��� �����ϱ� ���� "\r\n"�� ���δ�.
			}
			System.out.println(f.getPath()+"�� �����Ͽ����ϴ�.");
			
			scanner.close();
			fw.close();
		} 
		catch (IOException e) { // ������ ������ �� ���� ��� ����
			e.printStackTrace();
		}
	}

}
