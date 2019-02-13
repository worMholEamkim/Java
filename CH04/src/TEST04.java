
public class TEST04 {

	public static void main(String[] args) {
		TEST04_Rectangle r = new TEST04_Rectangle(2, 2, 8, 7);
		TEST04_Rectangle s = new TEST04_Rectangle(5, 5, 6, 6);
		TEST04_Rectangle t = new TEST04_Rectangle(1, 1, 10, 10);

		r.show();
		System.out.println("s의 면적은 " + s.square());
		if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
		if(t.contains(s)) System.out.println("t는 s을 포함합니다.");
		
	}

}
