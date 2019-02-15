import java.util.Scanner;

public class ChangeCoin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int coin, oman, man, ochun, chun, obak, bak, sip, il = 0;
		System.out.println("돈 입력해바>>");
		coin = in.nextInt();
		
		oman = coin/50000;
		man = (coin-(oman*50000))/10000; 
		ochun = (coin-((oman*50000)+(man*10000)))/5000;
		chun = (coin-((oman*50000)+(man*10000)+(ochun * 5000)))/1000;
		obak = (coin-((oman*50000)+(man*10000)+(ochun * 5000)+(chun * 1000)))/500;
		bak = (coin-((oman*50000)+(man*10000)+(ochun * 5000)+(chun * 1000)+(obak * 500)))/100;
		sip = (coin-((oman*50000)+(man*10000)+(ochun * 5000)+(chun * 1000)+(obak * 500)+(bak * 100)))/10;
		il = ((coin-((oman*50000)+(man*10000)+(ochun * 5000)+(chun * 1000)+(obak * 500)+(bak * 100)+(sip * 10))) % 10);
		
		
		if(coin > 50000) {
			System.out.println("오만원권" + oman + "매");
			System.out.println("만원권" + man + "매");
			System.out.println("오천원권" + ochun + "매");
			System.out.println("천원권" + chun + "매");
			System.out.println("오백원" + obak + "매");
			System.out.println("백원" + bak + "매");
			System.out.println("십원" + sip + "매");
			System.out.println("일원" + il + "매");
		}
		else if(coin > 10000) {
			System.out.println("만원권" + man + "매");
			System.out.println("오천원권" + ochun + "매");
			System.out.println("천원권" + chun + "매");
			System.out.println("오백원" + obak + "매");
			System.out.println("백원" + bak + "매");
			System.out.println("십원" + sip + "매");
			System.out.println("일원" + il + "매");
		}else if(coin > 5000) {			
			System.out.println("오천원권" + ochun + "매");
			System.out.println("천원권" + chun + "매");
			System.out.println("오백원" + obak + "매");
			System.out.println("백원" + bak + "매");
			System.out.println("십원" + sip + "매");
			System.out.println("일원" + il + "매");
		}else if(coin > 1000) {			
			System.out.println("천원권" + chun + "매");
			System.out.println("오백원" + obak + "매");
			System.out.println("백원" + bak + "매");
			System.out.println("십원" + sip + "매");
			System.out.println("일원" + il + "매");
		}else if(coin > 500) {			
			System.out.println("오백원" + obak + "매");
			System.out.println("백원" + bak + "매");
			System.out.println("십원" + sip + "매");
			System.out.println("일원" + il + "매");
		}else if(coin > 100) {
			
			System.out.println("백원" + bak + "매");
			System.out.println("십원" + sip + "매");
			System.out.println("일원" + il + "매");
		}else if(coin > 10) {			
			System.out.println("십원" + sip + "매");
			System.out.println("일원" + il + "매");
		}else {			
			System.out.println("일원" + il + "매");
		}
	
	}

}
