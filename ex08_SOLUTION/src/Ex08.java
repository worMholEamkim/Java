import java.io.*;

public class Ex08 {

	public static void main(String[] args) {
		File file = new File("c:\\");
		File [] files = file.listFiles(); // c:\�� �ִ� ���͸��� ������ ����Ʈ ��� 
		
		long bigSize = 0;
		File bigFile =null;
		for(int i=0; i<files.length; i++) { // ��ü ���Ͽ� ����
			File f = files[i];
			if(!f.isFile()) // ���͸��� ��� �Ѿ
				continue;
			
			long size = f.length(); // ������ ��� ���� ���� 
			if(bigSize < size) {
				bigSize = size;
				bigFile = f;
			}
		}

		if(bigFile == null) // ��� ���͸��� ���
			System.out.println("������ �����ϴ�");
		else
			System.out.println("���� ū ������ " + bigFile.getPath() + " " + bigSize + "����Ʈ");
	}

}
