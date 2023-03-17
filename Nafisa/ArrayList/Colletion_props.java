package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Colletion_props {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(1);
		list.add(25);
		list.add(1);
		list.add(35);
		list.add(45);
		list.add(1);
		list.add(65);
		list.add(1);
		list.add(45);
		list.add(1);
		list.add(98);
		
		System.out.println(list);
		System.out.println(Collections.min(list));
		System.out.println(Collections.max(list));
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list,Comparator.reverseOrder());
		System.out.println(list);

		System.out.println(Collections.frequency(list, 1));
		
		//Normal array
		int [] n = {6,4,2,6,2,8,5,2,1,77,10,34,56};
		Arrays.sort(n);
		for(int i : n) {
			System.out.print(i + " ");
		}
		
		System.out.println();
	
		int index = Arrays.binarySearch(n, 77) ; 
		System.out.println(index);
		
	}

}
