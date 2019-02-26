import java.io.*;

public class Ex07 {
	public static void main(String[] args) {
		BufferedInputStream srcStream = null;
		BufferedOutputStream destStream = null;
		File srcFile = new File("a.jpg");
		File destFile = new File("b.jpg");
		try {
			srcStream = new BufferedInputStream(new FileInputStream(srcFile)); // ���� �Է� ��Ʈ���� ����
			destStream = new BufferedOutputStream(new FileOutputStream(destFile)); // ���� ��� ��Ʈ���� ����
			
			long tenPercent = srcFile.length() / 10; // ������ 10% ũ��
			long progress = 0; // ���� ũ�� 10% �� ������ ���� ���� ����Ʈ ��
			
			System.out.println("a.jpg�� b.jpg�� �����մϴ�. \n10%���� *�� ����մϴ�.");
			byte[] buf = new byte[1024]; // �� �� �д� ����
			int numRead = 0; // ���� ����Ʈ �� 
			while (true) {
				numRead = srcStream.read(buf, 0, buf.length);
				if(numRead == -1) { // ���� ���� ������
					if(progress > 0) { // �������� �о����� 10%�� �������� �ʾ� *�� ��µ��� ���� ���
						System.out.print("*");
					}
					break; // ���� ���� ������
				}
				if (numRead > 0)
					destStream.write(buf, 0, numRead);
				
				progress += numRead; // ���� ũ�� 10% �� ������ ���� ���� ����Ʈ ��
				if (progress >= tenPercent) { // 10% ��ŭ �о��ٸ�
					System.out.print("*");
					progress = 0; // * ����ϰ� progress�� 0���� ����
				}
			}
           	srcStream.close();
           	destStream.close();
		} catch (IOException e) {
			System.out.println("����� ������ �߻��߽��ϴ�.");
		}
	}
}