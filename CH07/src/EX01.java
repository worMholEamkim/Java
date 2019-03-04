import java.util.Vector;

public class EX01 {

	public static void main(String[] args) {
		Vector  <Integer> v = new Vector <Integer> ();
		
		v.add(5);
		v.add(4);
		v.add(-1);
		
		v.add(2, 100); //4¶û 1»çÀÌ¿¡ 100 »ğÀÔ ¾ÑÈï
		
		System.out.println("º¤ÅÍ ³»ÀÇ ¿ä¼Ò °´Ã¼ ¼ö : " + v.size());
		System.out.println("º¤ÅÍÀÇ ÇöÀç ¿ë·® : " + v.capacity());
		
		for(int i=0; i<v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);
		}
		
		int sum = 0;
		for(int i=0; i<v.size(); i++) {
			int n = v.elementAt(i);
			sum += n;
		}
		System.out.println("º¤ÅÍ¿¡ ÀÖ´Â Á¤¼ö ÇÕ : " + sum);
		
	}

}
