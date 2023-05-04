package Queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Nafisa_PriorityQueue {

	public static void main(String[] args) {
		
//		PriorityQueue<Integer> pq = new PriorityQueue<>();// minHeap 
//		
//		pq.offer(111);
//		pq.offer(34);
//		pq.offer(40);
//		pq.offer(1);
//		pq.offer(2);
//		pq.offer(31);
//		pq.offer(56);
//		pq.offer(41);
//		
//		System.out.println(pq);
//		
//		System.out.println(pq.poll());
//		System.out.println(pq);
//		System.out.println(pq.poll());
//		System.out.println(pq);
//		
//		
//		
//		System.out.println(pq.peek());
		
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // max heap 
		
		
		pq.offer(34);
		pq.offer(40);
		pq.offer(1);
		pq.offer(2);
		pq.offer(31);
		pq.offer(56);
		pq.offer(41);
		pq.offer(111);
		
		System.out.println(pq);
		
		System.out.println(pq.poll());
		
		System.out.println(pq);
		
		
		System.out.println(pq.peek());
		

	}

}
