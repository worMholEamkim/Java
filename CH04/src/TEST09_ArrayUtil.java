
public class TEST09_ArrayUtil {
	public static int[] concat(int[] a, int[] b) {
		int [] c = new int[a.length + b.length];
		for(int i=0; i<a.length; i++)
			c[i] = a[i];
		
		int k = a.length;
		for(int j=a.length; j<(k + b.length); j++)
			c[j] = b[j - a.length];
		
		return c;
			
	}
	
	public static void print(int[] a) {
		for(int i=0; i<a.length; i++)
			System.out.println(a[i]);
	}
}
