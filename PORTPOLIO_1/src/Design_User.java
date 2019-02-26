
public class Design_User {
	private String id;
	private String pw;
	private String name;
	private String phone;
	private int money;
	//객체형 멤버 변수
	private Design_Ticket ticket;
	
	public Design_User(String id, String pw, String name, String phone, int money) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
		this.money = money;
	}
	
	//유저가 가지는 티켓, 유저에서 처리
	public void butTicket(Design_Ticket ticket) {
		System.out.println("티켓을 구매해버린다");
		this.ticket = ticket; //사용자가 티켓을 가짐
		
		//남은 돈
		//겟프라이스는 티켓값
		money = money - ticket.getPrice();
		ticket.checkTicket();
	}

	//체크티켓
	public void checkTicket() {
		this.ticket.checkTicket();
	}
	
	//현재 가지고 있는 돈 출력
	public void checkMoney() {
		System.out.println("현재 돈 " + money);
		System.out.println("==================");
	}
	
	}
	
	
	
