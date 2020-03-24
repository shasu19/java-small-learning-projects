package com.shasu19p.main;

import java.util.PriorityQueue;

/**
 * - Create priority queue with string values
 * - add some elements
 * - iterate all elements
 * 
 * - Learning: While removing only, applies the sorting mechanism to remove elements
 * */
public class PriorityQueueExample03 {

	public static void main(String[] args) {

        // Create a Priority Queue with a custom Comparator
        // Comparator.comparingInt(String::length)
		PriorityQueue<String> namePriorityQueue = new PriorityQueue<>((s1, s2) -> s1.length() - s2.length());

        // Add items to a Priority Queue (ENQUEUE)
        namePriorityQueue.add("Subh");
        namePriorityQueue.add("Anil");
        namePriorityQueue.add("Sunandni");
        namePriorityQueue.add("Bandhu");
        namePriorityQueue.add("Vanshu");
        namePriorityQueue.add("Sarvagya");
        namePriorityQueue.add("Shanu");

        // Remove items from the Priority Queue (DEQUEUE)
        System.out.println("===== Iterating queue ====== remove() API call");
        while (!namePriorityQueue.isEmpty()) {
            System.out.println(namePriorityQueue.remove());
        }
	}
}
