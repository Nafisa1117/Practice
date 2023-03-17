package All_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Nafisa_Set {

	public static void main(String[] args) {
	
		//Set<Integer> set = new HashSet<>();// O(1)
		Set<Integer> set = new TreeSet<>();
		
		set.add(32); 
		set.add(32);
		set.add(65);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(21);
        set.add(65);
        set.add(2);
        
        System.out.println(set);
        System.out.println(set.remove(2));
        System.out.println(set.contains(65));
        
        System.out.println(set.size());
        set.clear();
        System.out.println(set.isEmpty());
        System.out.println(set);


		

	}

}
