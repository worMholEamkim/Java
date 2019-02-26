import java.io.*;
import java.util.Scanner;

public class Ex06 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileReader fReader = null;
		FileWriter fWriter = null;
		
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		
		System.out.print("ù��° ���� �̸��� �Է��ϼ���>>");
		String s1 = scanner.nextLine();
		
		System.out.print("�ι�° ���� �̸��� �Է��ϼ���>>");
		String s2 = scanner.nextLine();
		try {
			fReader = new FileReader(s1); // ù��° ���� ��Ʈ�� ����
			fWriter = new FileWriter("appended.txt"); // ��ġ�� ���� �ϸ�
			writeToFile(fReader, fWriter); // ù��° ������ �о� ��ġ�� ���Ͽ� ���
			fReader.close(); //  ù��° ��Ʈ�� �ݱ�
			
			fReader = new FileReader(s2); // �ι�° ��Ʈ�� ����
			writeToFile(fReader, fWriter); // �ι�° ������ �о� ��ġ�� ���Ͽ� ���̾� ���
			
			fReader.close();
			fWriter.close();
			System.out.println("������Ʈ ���� �ؿ� appended.txt ���Ͽ� �����Ͽ����ϴ�.");			
		} catch (FileNotFoundException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
		} catch (IOException e) {
			System.out.println("����� ������ �߻��߽��ϴ�.");
		}
		scanner.close();
	}

	private static void writeToFile(FileReader in, FileWriter out) throws IOException {
		char buf[] = new char[50]; // ���� ũ�� 50 ����Ʈ
		int count = 0; // count�� ���� ���� ����. while ���� ó�� ���� ���� �ӽ� ��.
		while (true) {
			count = in.read(buf, 0, buf.length); // buf[] ũ�� ��ŭ �б�
			if(count == -1)
				break; // ���� ���� ������
			if (count > 0) { // ���� ���� �ִٸ� 
				out.write(buf, 0, count); // ���� ��ŭ ��ġ�� ���Ͽ� ����
			}
		}
	}
}
