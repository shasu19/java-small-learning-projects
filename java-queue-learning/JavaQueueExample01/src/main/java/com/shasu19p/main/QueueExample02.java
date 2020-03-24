package com.shasu19p.main;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Creating a Queue and Performing basic operations like Enqueue and Dequeue.
 * Difference between peek and remove. 
 * - remove > throws NoSuchElementException if queue is empty 
 * - poll > returns null if queue is empty
 * - element > returns element but does not remove from queue end, and throws NoSuchElementException if
 *             queue is empty
 * - peek >  returns elements if found, otherwise null if queue is empty          
 * 
 */
public class QueueExample02 {

	public static void main(String[] args) {

		// Create queue
		Queue<String> queue = new LinkedList<String>();

		// add some elements
		queue.add("Subh");
		queue.add("Anil");
		queue.add("Sunandni");
		queue.add("Bandhu");
		queue.add("Sarvagya");

		System.out.println("Queue : " + queue);

		// Check if a Queue is empty
		System.out.println("is queue empty? : " + queue.isEmpty());

		// Find the size of the Queue
		System.out.println("Size of queue : " + queue.size());

		// Check if the Queue contains an element
		String name = "Sunandni";
		if (queue.contains(name)) {
			System.out.println("Queue contains " + name);
		} else {
			System.out.println("Queue doesn't contain " + name);
		}

		// Get the element at the front of the Queue without removing it using element()
		// The element() method throws NoSuchElementException if the Queue is empty
		String queueElement = queue.element();
		System.out.println("First Person in the Queue (element()) : " + queueElement);

		// Get the element at the front of the Queue without removing it using peek()
		// The peek() method is similar to element() except that it returns null if the
		// Queue is empty
		queueElement = queue.peek();
		System.out.println("First Person in the Queue (peek()) : " + queueElement);

	}
}
