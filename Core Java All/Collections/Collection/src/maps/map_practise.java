package maps;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class map_practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Map -> hashMap, treeMap, linkedHashMap

        Map<String, Integer> hm = new HashMap<String, Integer>();
//        hm.put("a", 1);
//        System.out.println(hm);
        
        hm.put("a", 10);
        hm.put("b", 20);
        hm.put("c", 30);
        hm.put("d", 40);
        System.out.println(hm);
        
        for(Map.Entry<String, Integer> me : hm.entrySet()) {
        	System.out.print(me.getKey()+" : ");
        	System.out.println(me.getValue());
        }
	}

}
