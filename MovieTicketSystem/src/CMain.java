
public class CMain {
	
	public static void main(String[] a)
	{
		User u1 = new User();
		User u2 = new User("idddd", "1234", "ȫ�浿", 20000, "010-1234-7894");
		
		Ticket t1 = new Ticket( 101, "��Ÿ����", 10000, "4�� 8�� H12", "2013/12/24 23:00");
		Ticket t2 = new Ticket( 102, "ŷ���� ��������", 5000, "6�� 5�� B12", "2015/12/22 23:00");
		
//		u1.checkTicket();
		u2.checkMoney();
		u2.butTicket(t1);
		u2.checkMoney();
		u2.checkTicket();
	}

}
