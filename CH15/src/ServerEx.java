import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx {
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			// 서버 소켓 생성
			listener = new ServerSocket(9999);
			System.out.println("연결을 기다리고 있습니다....");;
			// 클라이언트로부터 연결 요청 대기
			socket = listener.accept(); 
			System.out.println("연결되었습니댜.");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				String inputMessage = in.readLine();
				if(inputMessage.equalsIgnoreCase("bye")) {
					System.out.println("클라이언트에서 bye로 연결 종료하였긔");
					break; 
					// bye를 받으면 연결 종료
				}
				System.out.println("클라이언트: " + inputMessage);
				// 프롬프트
				System.out.println("보내기>>");
				// 키보드에서 한 행 읽긔
				String outputMessage = scanner.nextLine();
				// 키보드에서 읽은 문자열 전송
				out.write(outputMessage + "\n");
				// out의 스트림 버퍼에 있는 모든 문자열 전송
				out.flush();
			}
		}catch (IOException e)
		{
			System.out.println(e.getMessage());
		}finally {
			try {
				scanner.close();
				socket.close();
				listener.close();
			}catch(IOException e)
			{
				System.out.println("클라이언트와 채팅 중 오류가 발생하엿긔");
			}
		}
	}
}
