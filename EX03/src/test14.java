import java.util.Scanner;

public class test14 {

	public static void main(String[] args) {
		String course [] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[] = {95, 88, 76 ,62 ,55};
		String sub;
		int count = 0;
		Scanner in = new Scanner(System.in);
		
		while(true) {
		System.out.print("과목 이름>>");
		sub = in.next();
		for (int i=0; i<course.length; i++)
			if (course[i].equals(sub))
				count += 1;
		
		if (count > 0) {
			for (int i=0; i<course.length; i++)
				if (course[i].equals(sub)) 
					System.out.println(course[i]+"의 점수눈 "+score[i]);
				else if(sub.equals("그만"))
					break;}
		else if (count == 0)
			System.out.println("없는 과목 데스");
	}
	}
}
