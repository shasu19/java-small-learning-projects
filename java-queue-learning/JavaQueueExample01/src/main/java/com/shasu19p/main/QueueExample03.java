package com.shasu19p.main;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Operations : Iterating queue elements
 * 
 */
public class QueueExample03 {

	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<String>();

		queue.add("Subh");
		queue.add("Anil");
		queue.add("Sunandni");
		queue.add("Bandhu");
		queue.add("Sarvagya");

		// Printing queue
		System.out.println(queue);

		System.out.println("==Iterating over a Queue using iterator() ===");
		Iterator<String> queueIterator = queue.iterator();
		while (queueIterator.hasNext()) {
			System.out.println(queueIterator.next());
		}

		System.out.println("==Iterating over a Queue using java8 for each===");
		queue.forEach(System.out::println);

		System.out.println("=== Iterating over a Queue using iterator() and Java 8 forEachRemaining() ===");
		queueIterator = queue.iterator();
		queueIterator.forEachRemaining(System.out::println);

		System.out.println("\n=== Iterating over a Queue using simple for-each loop ===");
		for (String name : queue) {
			System.out.println(name);
		}
	}
}
