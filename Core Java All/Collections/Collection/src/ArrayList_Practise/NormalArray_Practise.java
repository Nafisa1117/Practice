package ArrayList_Practise;

import java.util.Arrays;

public class NormalArray_Practise {

	public static void main(String[] args) {
		
		int[] arr = {2, 88, 61, 10, 90, 6, 3};
		
		Arrays.sort(arr);
		
		
		for(int i : arr) {
			//System.out.println(i);
			System.out.print(i + " ");
		}
		System.out.println();
		
		/////////////////////////////////////////////////////////////
		
		int index = Arrays.binarySearch(arr, 10);
		System.out.println(index);
		
		///////////////////////////////////////////////////////////
		
		Integer[] arr1 = new Integer[2];
		arr1[0] = 1;
		arr1[1]= 2;
		//arr1[2]= 3;
		System.out.println(arr1);
		
	}
	
	
	
}
