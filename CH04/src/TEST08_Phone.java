

public class TEST08_Phone {
	
	//�������
	private String name;
	private String tel;
	
	//������ -> ����Ѱ� set()�ޙ�
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
