
public class User 
{
	private String id;
	private String pw;
	private String name;
	private int money;
	private String phone;
	//객체형 멤버변수
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
		System.out.println("티켓을 구매합니다");
		this.ticket = ticket;//사용자가 티켓을 가짐
		
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
		System.out.println("현재 돈"+ money);
		System.out.println("----------------");
	}
	
	

}
