package Queue;

import java.util.ArrayDeque;

public class Nafisa_ArrayDeque {

	public static void main(String[] args) {
		
	ArrayDeque<Integer> Arr = new ArrayDeque<>();
	
	Arr.offer(12); // Queue 
	Arr.offerFirst(11);
	Arr.offerLast(13); // ArrayDeque 
	Arr.offer(14);
	System.out.println(Arr);
	
//	System.out.println(Arr.poll()); // Queue 
//	System.out.println(Arr.pollLast()); // ArrayDeque
//	System.out.println(Arr.pollFirst());
//	System.out.println(Arr);	
	
	System.out.println("Normal peek " + Arr.peek());
	System.out.println("peek First "+Arr.peekFirst());
	System.out.println("Peek last "+Arr.peekLast());
	
	
	}

}
