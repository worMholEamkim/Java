
public class TEST07_Day {
	private String work;
	public void set(String work) {
		this.work = work;
	}
	public String get() {
		return work;
		}
	public void show() {
		//if(work.equals("")) 
		if(work == null) System.out.println("없습니댜.");
		else
			System.out.println(work + "이므니다.");
	}
}
