
public class EX08_MAIN {

	public static void main(String[] args) {
		char c[] = {'T', 'h', 'i', 's', ' ', 'i', 's', ' ', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.'};
		
		EX08_ArrayPassingEx c1 = new EX08_ArrayPassingEx();
		
		c1.printCharArray(c);
		c1.replaceSpace(c);
		c1.printCharArray(c);
		
	}

}
