package com.shasu19p.main;

import java.util.PriorityQueue;

/**
 * - Create priority queue
 * - add some elements
 * - iterate all elements
 * */
public class PriorityQueueExample01 {

	public static void main(String[] args) {

		// Create a Priority Queue
		PriorityQueue<Integer> numbers = new PriorityQueue<>();

		// Add items to a Priority Queue (ENQUEUE)
		numbers.add(750);
		numbers.add(500);
		numbers.add(900);
		numbers.add(100);

		// iterate all elements in queue
		System.out.println("============ normal priority queue for each print =====");
		numbers.forEach(System.out::println);

		// Remove items from the Priority Queue (DEQUEUE)
		System.out.println("===== queue iterate =====");
		while (!numbers.isEmpty()) {
			System.out.println(numbers.remove());
		}

	}
}
