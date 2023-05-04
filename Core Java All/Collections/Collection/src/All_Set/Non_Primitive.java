package All_Set;

import java.util.HashSet;
import java.util.Set;

public class Non_Primitive {
	
	
public static void main(String[] args) {
	
	Set<Student> s = new HashSet<>();
	s.add(new Student(1, "Nafisa"));
	s.add(new Student(2, "Partha"));
	s.add(new Student(3, "Chinku"));
	s.add(new Student(4, "Kitty"));
	s.add(new Student(5, "Asif"));
	s.add(new Student(1, "Nafisa"));
	s.add(new Student(8, "Partha"));
	s.add(new Student(1, "Nafisa"));
	s.add(new Student(2, "Partha"));
	s.add(new Student(1, "Nafisa"));
	s.add(new Student(2, "Partha"));
	s.add(new Student(1, "Nafisa"));
	s.add(new Student(2, "Partha"));
	
	
	for(Student i : s) {
		System.out.println(i);
	}
}


}
