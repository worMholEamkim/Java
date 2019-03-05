import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample3 {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
		serverSocket = new ServerSocket(9002);
		System.out.println("wait!");
		while(true) {
			Socket socket = serverSocket.accept();
			Thread thread = new PerClientThread(socket);
			thread.start();
			System.out.println("conn!");
		}
	}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
