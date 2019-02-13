import java.util.Scanner;
public class TEST10_DicApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("한영 자동 검색프로그램");
		
		while(true) {
			System.out.println("한글 단어?");
			String kor = sc.next();
			
			if(kor.equals("그만"))
				break;
			
			String eng = TEST10_Dictionary.kor2Eng(kor);
			
			if(eng == null)
				System.out.println(kor + " 는 저의 사전에 없습니다.");
			else
				System.out.println(kor + "는 " + eng);
		}
		;
	}

}
