
public class TEST09_StaticEx {

	public static void main(String[] args) {
		int [] array1 = {1, 5, 7, 9};
		int [] array2 = {3, 6, -1, 100, 77};
		int [] array3 = TEST09_ArrayUtil.concat(array1, array2);
		TEST09_ArrayUtil.print(array3);
	}

}
