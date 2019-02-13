
public class TEST02_Grade {
	int korean;
	int english;
	int math;
	
	public TEST02_Grade(int point1, int point2, int point3)
	{
		this.korean = point1;
		this.english = point2;
		this.math = point3;
	}
	
	int average() {
		int sum = this.korean + this.english + this.math;
		int avg = sum / 3;
		
		return avg;
	}
}
