package Arrays;

public class CollectionArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Integer array
		int[] arr = new int[2];
		arr[0] = 1;
		arr[1] = 2;
		System.out.println(arr);
		
		
		//Object Array
		Student[] s = new Student[2];
		s[0] = new Student(1,"Nafisa",780);
		s[1] = new Student(2,"Nafooa",550);

		for(Student i : s) {
			System.out.println(i.getRoll()+i.getName()+i.getMarks());
		}

	}

}
