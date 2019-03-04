
class CH09 <T>{
	int tos;
	Object [] stck;
	public CH09() {
		tos = 0;
		stck = new Object[10];
	}
	
	public void push(T item) {
		if(tos == 10)
			return;
		stck[tos] = item;
		tos++;
	}
	
	public T pop() {
		if(tos == 0)
			return null;
		tos--;
		return (T)stck[tos];
	}
	
	public static void main(String[] args) {
		CH09 <String> stringStack = new CH09 <String> ();
		stringStack.push("ºÎ»ê");
		stringStack.push("¿ï»ê");
		stringStack.push("ÀÕÈþ");
		
		
		for(int n=0; n<3; n++)
			System.out.println(stringStack.pop());
		
		CH09 <Integer> intStack = new CH09 <Integer> ();
		intStack.push(1);
		intStack.push(3);
		intStack.push(5);
		
		for(int n=0; n<3; n++)
			System.out.println(intStack.pop());
		
	}

}
