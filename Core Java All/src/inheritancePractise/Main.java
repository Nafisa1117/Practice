package inheritancePractise;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Write a Java program to create a class called Animal with a method 
		//called makeSound(). Create a subclass called Cat that overrides the makeSound()
		//method to bark.
		Animal animal = new Animal();
		animal.makeSound();
		
		Cat cat = new Cat();
		cat.makeSound();

	}

}
