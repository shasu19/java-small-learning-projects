package com.shasu19p.main;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Creating a Queue and Performing basic operations like Enqueue and Dequeue
 */
public class QueueExample01 {

	public static void main(String[] args) {

		// Create and initialize a Queue using a LinkedList
		// Iterable -> Collections - Queue - Dequeue -> LinkedList (Impl)
		Queue<String> queue = new LinkedList<String>();

		// Adding new elements to the Queue (The Enqueue operation)
		queue.add("Test");
		queue.add("Subh");
		queue.add("Golu");
		queue.add("Bhaiyu");
		queue.add("Anil");

		System.out.println("Queue : " + queue);

		// The Dequeue operation
		// The remove() method throws NoSuchElementException if the Queue is empty
		String name = queue.remove();
		System.out.println("Removed from Queue : " + name + " | New Queue : " + queue);

		// Removing an element from the Queue using poll()
		// The poll() method is similar to remove() except that it returns null if the
		// Queue is empty.
		name = queue.poll();
		System.out.println("Removed from Queue : " + name + " | New Queue : " + queue);
	}
}
