package LinkedList_practise;

import java.util.Iterator;
import java.util.LinkedList;

public class practise {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(2);
		linkedList.add(40);
		linkedList.add(8);
		linkedList.add(1);
		
		System.out.println(linkedList);
		
		linkedList.add(0, 100);
		System.out.println(linkedList);
		
		linkedList.set(1, 33);
		System.out.println(linkedList);
		
		System.out.println(linkedList.remove(3));
		System.out.println(linkedList.remove(Integer.valueOf(8)));
		System.out.println(linkedList);
		
		System.out.println(linkedList.contains(8));
		
		linkedList.clear();
		System.out.println(linkedList);
		
		
		//for loop
		for(int i=0; i<linkedList.size(); i++) {
			System.out.print(linkedList.get(i));
		}
		
		
		//forEach loop
		for(int i : linkedList) {
			System.out.println(i);
		}
		
		//Iterator
		Iterator<Integer> iterateLinkedList = linkedList.iterator();
		while(iterateLinkedList.hasNext()) {
			System.out.println(iterateLinkedList.next());
		}
	}

}
