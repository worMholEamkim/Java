
public class Text01 {
	public static void main(String[] args) {
		int sum=0, i=0;
		while( i < 100 ) {
			sum = sum + i;
			i += 2;
		}
		System.out.println(sum);
	
		for(int k=0;k<100;k++) {
			if (k % 2 == 0) {
				k++;
				sum += 1;
			}
			else
				k++;
		}
		int j = 0;
		do {
				j++;
				sum += 1;
		}while(j<100);
	
	
	}
	
	
}
