package ArrayList_Practise;

import java.util.ArrayList;

public class ArrayList_practise {
	
	public static void main(String[] args) {
		
		
//		Integer[] arr1 = new Integer[2];
//		arr1[0] = 1;
//		arr1[1]= 2;
//		//arr1[2]= 3;
//		System.out.println(arr1);
		
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(100);
		arrayList.add(20);
		arrayList.add(50);
		
		System.out.println(arrayList);
		
		arrayList.add(1,01);
		System.out.println(arrayList);
		
		arrayList.set(2, 44);
		System.out.println(arrayList);
		
		System.out.println(arrayList.get(1));
		
		System.out.println(arrayList.remove(2));
		System.out.println(arrayList);
		
		System.out.println(arrayList.remove(Integer.valueOf(1)));
		System.out.println(arrayList);
		
		
	}

}
