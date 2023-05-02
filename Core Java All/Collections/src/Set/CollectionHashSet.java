package Set;

import java.util.HashSet;

public class CollectionHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> hs = new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(null);
		hs.add(null);
		System.out.println(hs); // [null, 20, 10]
		
		
		System.out.println(hs.contains(10));
		
		System.out.println(hs.remove(null));
		System.out.println(hs); // [20, 10]
		
		for(Integer i : hs) {
			System.out.println(i);
		}
		
		//HashSet internally uses the HashMap to store the elements
		
		
	}

}
