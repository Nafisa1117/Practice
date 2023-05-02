package JavaUtilArrays;

import java.util.Arrays;

public class SerchingArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[3];
		arr[0] = 2;
		arr[1] = 100;
		arr[2] =1;
		
		Arrays.sort(arr);
		
		//searching index of an element
		int index = Arrays.binarySearch(arr, 100);
		System.out.println(index);
		
	}

}
