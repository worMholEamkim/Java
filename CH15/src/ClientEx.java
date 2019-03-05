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
				// 프롬프트
				System.out.println("보내긔>>");
				// 키보드에서 한 행 읽긔
				String outputMessage = scanner.nextLine();
				if(outputMessage.equalsIgnoreCase("bye")) {
					// bye 문자열 전송
					out.write(outputMessage + "\n");
					out.flush();
					// 사용자가 bye를 입력한 경우 서버로 전송 후 실행 종료
					break;
				}
				out.write(outputMessage + "\n");
				out.flush();
				String inputMessage = in.readLine();
				System.out.println("서버: " + inputMessage);
				
			}
		}catch(IOException e) {
				System.out.println(e.getMessage());
			}finally {
				try {
					scanner.close();
					if(socket != null) socket.close();
				}catch(IOException e) {
					System.out.println("서버와 채팅 중 오류가 발생스");
				}
			}
		
	}

}
