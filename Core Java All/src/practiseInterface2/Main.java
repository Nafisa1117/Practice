package practiseInterface2;

public class Main {

	public static void main(String[] args) {
		//1. Write a Java program to create an interface Shape with the getArea() method. 
		//Create three classes Rectangle, Circle, and Triangle that implement the Shape interface.
		//Implement the getArea() method for each of the three classes.
		
		Rectangle r = new Rectangle(2, 4);
		System.out.println("Area of rectangle is: "+ r.getArea());
		
	}

}
