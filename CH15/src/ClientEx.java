import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {

	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			socket = new Socket("localhost", 9999);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				// ������Ʈ
				System.out.println("������>>");
				// Ű���忡�� �� �� �б�
				String outputMessage = scanner.nextLine();
				if(outputMessage.equalsIgnoreCase("bye")) {
					// bye ���ڿ� ����
					out.write(outputMessage + "\n");
					out.flush();
					// ����ڰ� bye�� �Է��� ��� ������ ���� �� ���� ����
					break;
				}
				out.write(outputMessage + "\n");
				out.flush();
				String inputMessage = in.readLine();
				System.out.println("����: " + inputMessage);
				
			}
		}catch(IOException e) {
				System.out.println(e.getMessage());
			}finally {
				try {
					scanner.close();
					if(socket != null) socket.close();
				}catch(IOException e) {
					System.out.println("������ ä�� �� ������ �߻���");
				}
			}
		
	}

}
