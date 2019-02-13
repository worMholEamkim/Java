
public class TEST01_TV
{
	String company;
	int year; int size;
	
	public TEST01_TV(String company1, int year1, int size1){
		this.company = company1;
		this.year = year1;
		this.size = size1;
	}
	public void show() {
	System.out.println(company + "에서 만든 " + year + "년 " + size + "인치");
}
}