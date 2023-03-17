package Set_practise;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	set -> hashSet , treeSet, LinkedhashSet
		
		///****** HashSet
		Set<Integer> hash_set = new HashSet<>();
		hash_set.add(1);
		hash_set.add(55);
		hash_set.add(44);
		
		System.out.println(hash_set);
		System.out.println(hash_set.contains(1));
		System.out.println(hash_set.remove(1));
		
		
		///////////////////////////////////////////////////
		
		//******* LinkedHashSet
		Set<String> lh = new LinkedHashSet<>();
		 lh.add("India");
	     lh.add("Australia");
	     lh.add("South Africa");
	     
	     lh.add("India");
	     System.out.println(lh);
	     
	     System.out.println(lh.contains("Australia"));
		 System.out.println(lh.remove("India"));
		
		
		/////////////////////////////////////////////////////////////////
		 
		 //***** TreeSet
		 Set<String> ts = new TreeSet<String>();
		 ts.add("India");
	     ts.add("South Africa");
	     ts.add("Australia");
		
	     System.out.println(ts);

	}

}
