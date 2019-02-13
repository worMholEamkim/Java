

public class TEST08_Phone {
	
	//멤버변수
	private String name;
	private String tel;
	
	//생성자 -> 비슷한게 set()메솓
	TEST08_Phone(String name, String tel){
		this.name = name;
		this.tel = tel;
	}
	
	public String getName(){
		return name; 
	}
	
	public String getTel() {
		return tel;
	}
}
