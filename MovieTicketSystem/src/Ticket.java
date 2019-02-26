
public class Ticket 
{
	//1.멤버변수
	private int num;
	private String name;
	private int price;
	private String seat_num;
	private String time;
	private boolean morning_sale;

	public Ticket(int num, String name, int price, String seat_num, String time) 
	{
		this.num = num;
		this.name = name;
		this.price = price;
		this.seat_num = seat_num;
		this.time = time;
	}	
	
	public void checkTicket()
	{
		System.out.println("1.티켓번호: "+num);
		System.out.println("2.영 화 명: "+name);
		System.out.println("3.티켓가격: "+price);
		System.out.println("4.좌석번호: "+seat_num);
		System.out.println("5.상영시간: "+time);
		System.out.println("------------------");
		System.out.println();
	}

	public int getPrice() {
		return price;
	}
	
}
