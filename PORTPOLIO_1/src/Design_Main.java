public class Design_Main {
	

	public static void main(String[] args) {
		//��ü ���� ���� + �ʱⰪ ����
		Design_User u1 = new Design_User("qwert", "4321", "�����", "010-1111-2222", 30000);
		Design_User u2 = new Design_User("asdfg", "1234", "��ä��", "010-2222-3232", 50000);
		
		Design_Ticket t1 = new Design_Ticket(101, "��Ÿ����", 10000, "4�� 8�� H12", "2013/12/14 23:00");
		Design_Ticket t2 = new Design_Ticket(102, "ŷ���� ��������", 7000, "6�� 5�� B13", "2014/12/14 23:00");
		
		
		u2.checkMoney();
		u2.butTicket(t1);
		u2.checkMoney();
		u2.checkTicket();
		
		
}
}


// �����ڷ� �ʱⰪ �����ϴ� ���
// ���� ��� �� �ְ�޴���
// �Լ�/ĸ��ȭ
