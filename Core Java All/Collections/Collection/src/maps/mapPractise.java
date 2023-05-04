package maps;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class mapPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, List<String>> m = new HashMap<>();
		
		m.put(1, Arrays.asList("Java","C++","php"));
		m.put(2, Arrays.asList("Java","C++","php"));
		m.put(3, Arrays.asList("Java","C++","php"));
		
		System.out.println(m);
		
		for(Map.Entry<Integer, List<String>> ent : m.entrySet()) {
			System.out.println(ent.getKey()+" : "+ent.getValue());
			//System.out.println(ent.getValue());
		}
		

		
//		List<String> l = new ArrayList<>();
//		l.add("Cat");
//		l.add("Dog");
//		l.add("Java");

	}

}
