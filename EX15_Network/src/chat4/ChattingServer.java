package chat4;

import java.io.*;
import java.net.*;
import java.util.*;

class ChatServer extends Thread {
	private ServerSocket ss;
	private Vector vc = new Vector(); 
	//ù��° �����ڸ� ���Ͽ�, ���� ���Ϳ� add() �̷������� �ι�°, ����° �����ڸ� ���� ����
	//Vector ��ϵǴ� ��� �����͸� ���������� ���� ���� ��ų �� �ִ�! ���� ��ġ ����� �ȵ�!

	public ChatServer() {
		try {
			ss = new ServerSocket(486); //��������(��Ʈ��ȣ) - �������α׷������� ���Ǵ� ����!
			this.start();
			System.out.println("������ ����!..Ŭ���̾�Ʈ ���� �����...");
		} catch (IOException ee) {
			System.err.println("�̹� ������Դϴ�.");
			System.exit(0);
		}
	}

	public void run() {
		while (true) {
			try {
				Socket imsi = ss.accept(); // ū ������. - ���� ���Ͽ� Ŭ���̾�Ʈ�� ��ٸ��ٰ� ������ �ϸ�...�׳� ���ϻ���...
				System.out.println("������ : " + imsi.toString());
				UserInfo ui = new UserInfo(imsi);
				for (int i = 0; i < vc.size(); i++) {
					UserInfo uiui = (UserInfo) vc.elementAt(i);
					uiui.getOut().println("/p" + ui.getNickName());
					uiui.getOut().flush();
				}
				vc.add(ui); // User ���� ����.
				for (int i = 0; i < vc.size(); i++) {
					UserInfo uiui = (UserInfo) vc.elementAt(i);
					ui.getOut().println("/o" + uiui.getNickName());
					ui.getOut().flush();
				}
			} catch (IOException ee) {
			}
		}
	}

	class UserInfo extends Thread { 
		private Socket soc;
		private String nickname;
		private PrintWriter out;
		private BufferedReader in;

		public UserInfo(Socket s) {
			this.soc = s;
			try {
				out = new PrintWriter(new BufferedWriter(
						new OutputStreamWriter(soc.getOutputStream())));// �۽�(���) - ����,�ܼ��� �ƴ� ��Ʈ��ũ ��Ʈ��! 
				in = new BufferedReader(new InputStreamReader(soc
						.getInputStream())); // ����(�Է�) - ����,�ܼ��� �ƴ� ��Ʈ��ũ ��Ʈ��!
				nickname = in.readLine();
				this.start();// ���� ������ ����..
			} catch (IOException ee) {
			}
		}

		public String getNickName() {
			return nickname;
		}

		public PrintWriter getOut() {
			return out;
		}

		public void run() {// ���� ������. - ������ ����ڸ� ����
			while (true) {
				try {
					String str = in.readLine();
					if (str.charAt(0) == '/') {
						if (str.charAt(1) == 'q') {
							for (int i = 0; i < vc.size(); i++) {
								UserInfo ui = (UserInfo) vc.elementAt(i);
								if (ui.nickname.equals(nickname)) {
									vc.removeElementAt(i);
									break;
								}
							}
							for (int i = 0; i < vc.size(); i++) {
								UserInfo ui = (UserInfo) vc.elementAt(i);
								ui.out.println("/q" + nickname);
								ui.out.flush();
							}
							break; // �� ��� Thread ����...
						} else if (str.charAt(1) == 'w') {
							String dest = str.substring(2, str.indexOf("-")).trim();
							String msg = str.substring(str.indexOf("-") + 1).trim();
							for (int i = 0; i < vc.size(); i++) {
								UserInfo ui = (UserInfo) vc.elementAt(i);
								if (ui.nickname.equals(dest)) {
									ui.out.println(nickname + "(�ӼӸ�:"	+ ui.nickname + ") >> " + msg);
									ui.out.flush();
									out.println(nickname + "(�ӼӸ�:"+ ui.nickname + ") >> " + msg);
									out.flush();
									break;
								}
							}
						}
					} else {
						for (int i = 0; i < vc.size(); i++) {
							UserInfo ui = (UserInfo) vc.elementAt(i);
							String data = nickname + " > " + str;
							ui.out.println(data);
							ui.out.flush();
						}
					}
				} catch (IOException ee) {
				}
			}
		}
	}
}

public class ChattingServer {
	public static void main(String[] args) {
		ChatServer cs = new ChatServer();
	}
}
