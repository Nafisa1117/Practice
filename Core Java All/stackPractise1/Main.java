package stackPractise1;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> stack = new Stack<>();
		
		stack.push("Nafisa");
		stack.push("Namgo");
		stack.push("flamingo");
		stack.push("green");
		
		System.out.println(stack);
		
		System.out.println(stack.empty());
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
		System.out.println(stack.isEmpty());
		

	}

}
