package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Partha {

	public static void main(String[] args) {
		
		Queue<String> q = new LinkedList<>();
		q.add("mello"); //error
		q.offer("Nafisa");
		q.offer("Partha");//safe
		q.offer("Chinku");
		System.out.println(q);
		
		System.out.println(q.poll());//safe
		System.out.println(q.remove());//not safe
		
		System.out.println(q.poll());//safe
		System.out.println(q.element());//not safe
		
		
		//⚫ add() - Inserts the specified element into the queue. If the task is successful, add() return true, 
		//if not it throws an exception.

		
		//⚫ offer() - Inserts the specified element into the queue. If the task is successful, offer() returns true, if not it returns false.



		//• element() - Returns the head of the queue. Throws an exception if the queue is empty.

		//peek() - Returns the head of the queue. Returns null if the queue is empty.



		//• remove() - Returns and removes the head of the queue. Throws an exception if the queue is empty.

		//poll() - Returns and removes the head of the queue. Returns null if the queue is empty.
	}

}
