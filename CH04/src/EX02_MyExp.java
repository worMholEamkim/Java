
public class EX02_MyExp {
	int base;	//�ʵ� ����
	int exp;
	
	int getValue() { 	//�޼ҵ�
		int res = 1;
		for(int i=0; i<exp; i++)
			res = res * base;
		return res;
	}
}
