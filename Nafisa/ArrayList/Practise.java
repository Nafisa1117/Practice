package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.print.attribute.Size2DSyntax;
import javax.print.attribute.standard.MediaSize.NA;

public class Practise {

	public static void main(String[] args) {
		
		//List<String> arr = new ArrayList<>();
		LinkedList<String> arr=new LinkedList<String>();  
		
		arr.add("N");
		arr.add("A");
		arr.add("F");
		
		System.out.println(arr);
		arr.set(1, "V");
		System.out.println(arr);
		arr.add(1, "X");
		System.out.println(arr);
		
		ArrayList<String> a = new ArrayList<>();
		a.add("{artha");
		a.add("Partha");
		System.out.println(a);
		
		arr.addAll(a);
		System.out.println(arr);
		
		System.out.println(arr.remove(1));

		System.out.println(arr);
		
		//arr.clear();
		System.out.println(arr.contains("N"));
		
		
	
		
		System.out.println("using for loop ");
		System.out.println("====================================");
		
		for(int i = 0 ; i <arr.size() ; i++ ) {
			System.out.println(arr.get(i));
		}
		
		System.out.println("using forEach loop ");
		System.out.println("====================================");
	
		// 
		for(String i : arr ) {
			System.out.println(i);
		}
		
		System.out.println("using Iterator loop ");
		System.out.println("====================================");
		
		Iterator<String> it = arr.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
	}

}
