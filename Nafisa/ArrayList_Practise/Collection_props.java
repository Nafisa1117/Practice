package ArrayList_Practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Collections class methods
public class Collection_props {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(54);
		list.add(55);
		list.add(1);
		list.add(8);
		list.add(70);
		
		System.out.println(list);
		System.out.println(Collections.min(list));
		System.out.println(Collections.max(list));
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list, Comparator.reverseOrder());
		System.out.println(list);
		
		System.out.println(Collections.frequency(list, 55));

	}

}
