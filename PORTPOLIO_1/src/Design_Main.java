public class Design_Main {
	

	public static void main(String[] args) {
		//객체 변수 생성 + 초기값 설정
		Design_User u1 = new Design_User("qwert", "4321", "김새암", "010-1111-2222", 30000);
		Design_User u2 = new Design_User("asdfg", "1234", "이채현", "010-2222-3232", 50000);
		
		Design_Ticket t1 = new Design_Ticket(101, "스타워즈", 10000, "4층 8관 H12", "2013/12/14 23:00");
		Design_Ticket t2 = new Design_Ticket(102, "킹스맨 조조할인", 7000, "6층 5관 B13", "2014/12/14 23:00");
		
		
		u2.checkMoney();
		u2.butTicket(t1);
		u2.checkMoney();
		u2.checkTicket();
		
		
}
}


// 생성자로 초기값 설정하는 방법
// 서로 어떻게 값 주고받는지
// 함수/캡슐화
