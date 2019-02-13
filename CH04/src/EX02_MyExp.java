
public class EX02_MyExp {
	int base;	//필드 선언
	int exp;
	
	int getValue() { 	//메소드
		int res = 1;
		for(int i=0; i<exp; i++)
			res = res * base;
		return res;
	}
}
