
public class Design_User {
	private String id;
	private String pw;
	private String name;
	private String phone;
	private int money;
	//��ü�� ��� ����
	private Design_Ticket ticket;
	
	public Design_User(String id, String pw, String name, String phone, int money) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
		this.money = money;
	}
	
	//������ ������ Ƽ��, �������� ó��
	public void butTicket(Design_Ticket ticket) {
		System.out.println("Ƽ���� �����ع�����");
		this.ticket = ticket; //����ڰ� Ƽ���� ����
		
		//���� ��
		//�������̽��� Ƽ�ϰ�
		money = money - ticket.getPrice();
		ticket.checkTicket();
	}

	//üũƼ��
	public void checkTicket() {
		this.ticket.checkTicket();
	}
	
	//���� ������ �ִ� �� ���
	public void checkMoney() {
		System.out.println("���� �� " + money);
		System.out.println("==================");
	}
	
	}
	
	
	
