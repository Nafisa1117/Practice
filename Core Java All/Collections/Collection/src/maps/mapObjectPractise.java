package maps;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;



public class mapObjectPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Student> m = new TreeMap<>();
		m.put("Nagpur", new Student(1,"Arshi"));
		m.put("Kolkata", new Student(2,"Partha"));
		
		System.out.println(m);
		
		for(Map.Entry<String, Student> entry : m.entrySet()) {
			System.out.println(entry.getValue());
		}

	}

}
