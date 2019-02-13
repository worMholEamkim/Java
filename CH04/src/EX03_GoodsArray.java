import java.util.Scanner;


public class EX03_GoodsArray {
	public static void main(String[] args) {
		EX03_Goods[] goodsArray;
		goodsArray = new EX03_Goods[3];
		
		Scanner s= new Scanner(System.in);
		
		for(int i=0; i<goodsArray.length; i++) {
			String name = s.next();
			int price = s.nextInt();
			int n = s.nextInt();
			int sold = s.nextInt();
			goodsArray[i] = new EX03_Goods(name, price, n, sold);
			
		}
		
		for(int i=0; i<goodsArray.length; i++) {
		System.out.println(goodsArray[i].getName()+" ");
		System.out.println(goodsArray[i].getPrice()+ " ");
		
		System.out.println(goodsArray[i].getNumberOfStock()+ " ");
		System.out.println(goodsArray[i].getSold());
		}
	}
		
}
