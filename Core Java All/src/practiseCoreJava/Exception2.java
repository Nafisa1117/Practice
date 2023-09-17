package practiseCoreJava;

public class Exception2 {

	public static void main(String[] args) {
		
//2. Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.
		
		OddNumberException(2);
		
	}
	
	public static void OddNumberException(int num) {
		
		try {
			checkOdd(num);
			System.out.println("number is even");
		}
		catch(IllegalArgumentException ie) {
			System.out.println("Error" +" = "+ ie.getMessage());
		}

	}
	
	public static void checkOdd(int number) {
		if(number % 2 != 0) {	
			throw new IllegalArgumentException(number + " is odd");
		}
	}

}
