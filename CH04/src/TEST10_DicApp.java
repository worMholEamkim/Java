import java.util.Scanner;
public class TEST10_DicApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ѿ� �ڵ� �˻����α׷�");
		
		while(true) {
			System.out.println("�ѱ� �ܾ�?");
			String kor = sc.next();
			
			if(kor.equals("�׸�"))
				break;
			
			String eng = TEST10_Dictionary.kor2Eng(kor);
			
			if(eng == null)
				System.out.println(kor + " �� ���� ������ �����ϴ�.");
			else
				System.out.println(kor + "�� " + eng);
		}
		;
	}

}
