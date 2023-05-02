package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Arrays.Student;

public class CollectionArrayList {
	
	public static void main(String[] args) {
		
		List<String> l = new ArrayList<>();
		l.add("A");
		l.add("C");
		l.add("T");
		l.add("B");
		System.out.println(l);
		
		//access elements by index
		String s = l.get(2);
		System.out.println(s);
		
		//remove elements
		l.remove(1);
		System.out.println(l);
		
		
		//creating list in easy manner
		List<String> l1 = Arrays.asList("Nafisa","Parveen","Rayeen");
		System.out.println(l1);
		
		
		List<Student> l2 = Arrays.asList(
				new Student(1,"Nafisa",200),
				new Student(2,"Parveen",342)
				);
		System.out.println(l2);
	}

}
