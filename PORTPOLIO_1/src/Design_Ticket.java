
public class Design_Ticket {
	
	private int num;
	private String name;
	private int price;
	private String seat_num;
	private String time;
	private boolean morning_sale;
	
	public Design_Ticket(int num, String name, int price, String seat_num, String time) {
		this.num = num;
		this.name = name;
		this.price = price;
		this.seat_num = seat_num;
		this.time = time;
	}

	public void checkTicket()
	{
		System.out.println("1. Ƽ�Ϲ�ȣ: " + num);
		System.out.println("2. �� ȭ ��: " + name);
		System.out.println("3. Ƽ�ϰ���: " + price);
		System.out.println("4. �¼���ȣ: " + seat_num);
		System.out.println("5. �󿵽ð�: " + time);
		System.out.println("--------------");
		System.out.println();
		
	}
	
	public int getPrice() {
		return price;
	}
}
