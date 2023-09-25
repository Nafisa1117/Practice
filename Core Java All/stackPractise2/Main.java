package stackPractise2;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		//How to travel through Stack using java.util.Stack.empty() method to get sum of 
		//all elements
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(23);
		stack.push(4);
		stack.push(11);
		stack.push(6);
		stack.push(2);
		
		System.out.println(stack);
		
		int sum = 0;
		
		while(!stack.isEmpty()) {
			sum = sum + stack.pop();
		}
		
		System.out.println(sum);
		


	}

}
