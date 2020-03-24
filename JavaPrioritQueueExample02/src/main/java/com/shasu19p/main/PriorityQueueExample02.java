package com.shasu19p.main;

import java.util.PriorityQueue;

/**
 * - Create priority queue with string values
 * - add some elements
 * - iterate all elements
 * 
 * - Learning: While removing only, applies the sorting mechanism to remove elements
 * */
public class PriorityQueueExample02 {

	public static void main(String[] args) {

		// Create a Priority Queue
		PriorityQueue<String> queue = new PriorityQueue<>();

		// Add items to a Priority Queue (ENQUEUE)
		queue.add("Subh");
		queue.add("Bandhu");
		queue.add("Sarvagya");
		queue.add("Anil");
		queue.add("Sunandni");
		queue.add("Vanshu");
		queue.add("Shanu");
		
		System.out.println("======= Iterate all elements ========");
		queue.forEach(System.out::println);

		// Remove items from the Priority Queue (DEQUEUE)
		System.out.println("======= Iterate all elements with remove() call ========");
		while (!queue.isEmpty()) {
			System.out.println(queue.remove());
		}

	}
}
