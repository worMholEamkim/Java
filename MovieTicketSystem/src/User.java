
public class User 
{
	private String id;
	private String pw;
	private String name;
	private int money;
	private String phone;
	//��ü�� �������
	private Ticket ticket;
	
	
	
	public User() {
		
	}
	public User(String id, String pw, String name, int money, String phone) 
	{
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.money = money;
		this.phone = phone;
	}
	
	public void butTicket(Ticket ticket)
	{
		System.out.println("Ƽ���� �����մϴ�");
		this.ticket = ticket;//����ڰ� Ƽ���� ����
		
		//money = money - ticket.price;
		money = money - ticket.getPrice();
		ticket.checkTicket();
	}
	


	public void checkTicket()
	{
		this.ticket.checkTicket();
	}
	
	public void checkMoney()
	{
		System.out.println("���� ��"+ money);
		System.out.println("----------------");
	}
	
	

}
