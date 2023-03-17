package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class mapping {
	public static void main(String[] args) {
		
					
		
//		Map<String, Integer> number = new HashMap<>(); // O(1)
		Map<String, Integer> number = new TreeMap<>(); // O(logN) 
		number.put("User1", 123456);
		number.put("User2", 456123);
		number.put("User3", 145362);
		number.put("User4", 561342);
		number.put("User5", 793489);
		number.put("User6", 986234);
		
//		System.out.println(number.containsKey("User12"));
//		System.out.println(number.containsValue(986284));
//		number.clear();
//		System.out.println(number.isEmpty());
		
		
//		System.out.println(number);
		
		
		for(Map.Entry<String, Integer> i : number.entrySet()) {
			System.out.println(i);
//			System.out.println(i.getKey());
			//System.out.println(i.getValue());
		}
		
//		// get key using forEach
//		for(String i : number.keySet()) {
//			System.out.println(i);
//		}
//		
//		//get value using forEach
//		for(Integer i : number.values()) {
//			System.out.println(i);
//		}
		
	}

}
