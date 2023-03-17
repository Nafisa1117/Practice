package Stacks;

import java.util.Stack;

public class Partha {

	public static void main(String[] args) {
		// stack LIFO appraoch follow krna hai
		
		Stack<Integer> st = new Stack<>();
		
		st.push(33);
		st.push(2);
		st.push(4);
		st.push(100);
//		System.out.println(st);
		
//		System.out.println(st.peek());
//		System.out.println(st.pop());
		
		System.out.println(st.search(0));
		System.out.println(st.search(4));
		System.out.println(st);
	}

}
