package JavaUtilArrays;

import java.util.Arrays;

public class PrintingArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[3];
		arr[0] = 2;
		arr[1] = 100;
		arr[2] =1;
		
		//print array elements
		System.out.println(Arrays.toString(arr));
	
	
		//sort array
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
