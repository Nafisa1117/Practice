package Vector;

import java.util.Vector;

public class CollectionVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<>();
		v.add(23);
		v.add(50);
		v.add(1);
		System.out.println(v);
		
		System.out.println(v.get(1));
		
		v.remove(0);
	}

}
