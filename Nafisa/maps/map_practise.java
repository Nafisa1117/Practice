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
        
        hm.put("a", new Integer(100));
        hm.put("b", new Integer(200));
        hm.put("c", new Integer(300));
        hm.put("d", new Integer(400));
        System.out.println(hm);
        
        for(Map.Entry<String, Integer> me : hm.entrySet()) {
        	System.out.print(me.getKey()+" : ");
        	System.out.println(me.getValue());
        }
	}

}
