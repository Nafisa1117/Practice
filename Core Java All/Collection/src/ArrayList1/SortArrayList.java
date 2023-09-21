package ArrayList1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {

	public static void main(String[] args) {
		
		//Sort an ArrayList
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(30);
		list.add(3);
		list.add(2);
		list.add(1);
		
		Collections.sort(list);
		
		System.out.println(list); //[1,2,3,30]
		
		for(Integer i: list) {
			System.out.println(i);
		}
		
		

	}

}
