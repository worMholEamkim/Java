
public class EX03_Goods {
	private String name;
	private int price;
	private int numberOfStock;
	private int sold;
	
	EX03_Goods(String n, int p, int nStock, int s){
		name = n;
		price = p;
		numberOfStock = nStock;
		sold = s;
	}
	
	String getName() {return name;}
		int getPrice() {return price;}
		int getNumberOfStock() {return numberOfStock;}
		int getsold() {return sold;}
	}
	
	
