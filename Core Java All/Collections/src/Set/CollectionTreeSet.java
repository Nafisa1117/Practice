package Set;

import java.util.Set;
import java.util.TreeSet;

public class CollectionTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s = new TreeSet<>();
		s.add(3);
		s.add(33);
		s.add(2);
		s.add(88);
		System.out.println(s);
		
		s.remove(3);
		System.out.println(s);

	}
	
	//in order to check the object uniqueness HashSet and LinkedHashSet class uses equals() ans hashcode() methods, where as TreeSet class uses compareTo() method, if compareTo() return 0;

}
