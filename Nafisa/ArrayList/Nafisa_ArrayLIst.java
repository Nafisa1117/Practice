package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Nafisa_ArrayLIst {

	public static void main(String[] args) {
	
//		String[]  school = new String[10]; //String array 
//		school[0] = "Nafisa";
//		
//		
//		school[9] = "Partha"; // size 10
////		school[10] = "Asif"; // normal array length fix or size fix hota hai 
//		
//		System.out.println(school);
//		
//		//DataType <Ele>
//		ArrayList<String> student  = new ArrayList<>(); // [null,0,fasle,0.0] = 10 ;
//		
//		student.add("Nafisa");//[Nafisa]
//		System.out.println(student);
//		
//		
//		
//		student.add("Chiku");//[Nafisa,Chiku]
//		student.add("Asif");//[Nafisa,Chiku,Asif] + 7 = 10 + 1 = (n + n/2 + 1) = 10 + 10/2 + 1  = 16 ka length (11 -> 16)
//		System.out.println(student);
//		
//		ArrayList<String> stu1  = new ArrayList<>();
//		stu1.add("Partha");
//		stu1.add("Manna");
//		
//		List<String> stu2 = new ArrayList<>();
//		stu2.add("Champuklal");
//		stu2.add("kalubhai");
//		
//		
//		student.addAll(stu1);
//		student.addAll(stu2);
//		System.out.println(student); // [Nafisa, Chiku, Asif, Partha, Manna, Champuklal, kalubhai]
		
		
		ArrayList<Integer> n  = new ArrayList<>();
		
		n.add(1);//0
		n.add(2);//1
		n.add(4);//2
		n.add(10);//3
		
		System.out.println(n);
		
		n.add(1,88);
		System.out.println(n);

		System.out.println(n.get(3));
		
		System.out.println(n.remove(1)); // indext 1 ko remove karo 
		
		System.out.println(n.remove(Integer.valueOf(4)));
		
		System.out.println(n);
		
		n.set(2, 40);
		System.out.println(n);
		
		

	}

}
