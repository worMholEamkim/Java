
public class TEST03_SONG {
	String title;
	String artist;
	int year;
	String country;
	
	public TEST03_SONG() {}
	
	public TEST03_SONG(String T, String A, int Y, String C) {
		title = T;
		artist = A;
		year = Y;
		country = C;
	}
	
	public void show() {
		System.out.println(year + "�� " + country + "�� " + artist + "�� �θ� " + title);
	}
}
