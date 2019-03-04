
public class EX10 {

	public static <T> CH09 <T> reverse(CH09 <T> a){
		CH09 <T> s = new CH09 <T> ();
		while(true) {
			T tmp;
			tmp = a.pop();
			if(tmp == null)
				break;
			else
				s.push(tmp);
		}
		return s;
	}
	
	public static void main(String[] args) {
		CH09 <Double> gs = new CH09 <Double>();
		
		for(int i=0; i<5; i++) {
			gs.push(new Double(i));
			
		}
		gs = reverse(gs);
		for(int i=0; i<5; i++) {
			System.out.println(gs.pop());
			}
	}

}
