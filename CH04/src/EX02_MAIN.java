
public class EX02_MAIN {

	public static void main(String[] args) {
		EX02_MyExp number1 = new EX02_MyExp();
		number1.base = 2;
		number1.exp = 3;
		
		EX02_MyExp number2 = new EX02_MyExp();
		number2.base = 3;
		number2.exp = 4;
		
		System.out.println("2�� 3�� = " + number1.getValue());
		System.out.println("3�� 4�� = " + number2.getValue());
		
	
	}

}
