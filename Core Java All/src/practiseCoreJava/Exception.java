package practiseCoreJava;

public class Exception {

	public static void main(String[] args) {
		
		//  Write a Java program that throws an exception and catch it using a try-catch block.
		
		//int num = 10/0;
		
		try {
			int num = 10/0;
		}
		catch(ArithmeticException ae) {
			System.out.println("Error" + ae.getMessage());
		}

	}

}
