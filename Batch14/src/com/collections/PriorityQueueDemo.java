package com.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<String> queue = new PriorityQueue<String>();
		
		queue.add("Wayne Rooney");
		queue.add("marcus rashford");
		queue.add("anthony martial");
		queue.add("Soresa Hailu");
		
//		System.out.println("head:"+ queue.element());
//		System.out.println("head:"+ queue.peek());
//		System.out.println("iterating the queue elements:");
		
		Iterator itr=queue.iterator();
		
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		
		queue.remove();
		queue.poll();
		System.out.println("after removing two elements:");
		
		Iterator<String> itr2=queue.iterator();
		while(itr2.hasNext())
		{
		System.out.println(itr2.next());
		}
		
	}

}
