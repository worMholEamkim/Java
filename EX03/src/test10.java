import java.util.Random;

public class test10 {

	public static void main(String[] args) {
		Random rd = new Random();
		int arr[][] = new int[4][4];
		
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr[i].length;j++)
				arr[i][j] = 0;
				//arr[i][j] = (int)(Math.random()*10+1);
		
	for(int i=0;i<10;++i) {
		int row = (int)(Math.random()*4);
		int column = (int)(Math.random()*4);
		if(arr[row][column] == 0)
			arr[row][column] = (int)(Math.random()*10+1);
		else
			--i;
		
	}
	for(int i=0;i<arr.length;i++)
		for(int j=0;j<arr[i].length;j++)
			System.out.print(arr[i][j]);
	}

}
