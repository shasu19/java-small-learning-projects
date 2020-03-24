package com.shasu19p.main;

import java.util.PriorityQueue;

/**
 * - Create priority queue with custom object
 * - add some custom object to queue
 * - iterate all elements
 * - Custom vehicle class implementing Comparable interface
 * */
public class PriorityQueueExample04 {

	public static void main(String[] args) {

        // Create a Priority Queue
		PriorityQueue<Vehicle> namePriorityQueue = new PriorityQueue<>();

        // Add items to a Priority Queue (ENQUEUE)
        namePriorityQueue.add(new Vehicle("Scooter", "2 Wheeler"));
        namePriorityQueue.add(new Vehicle("Honda Shine", "2 Wheeler"));
        namePriorityQueue.add(new Vehicle("Swift", "4 Wheeler"));
        namePriorityQueue.add(new Vehicle("SUV", "4 Wheeler"));
        namePriorityQueue.add(new Vehicle("BMW", "4 Wheeler"));
        namePriorityQueue.add(new Vehicle("Activa", "2 Wheeler"));

        // Remove items from the Priority Queue (DEQUEUE)
        System.out.println("===== Iterating queue - remove() API call======");
        while (!namePriorityQueue.isEmpty()) {
            System.out.println(namePriorityQueue.remove());
        }
	}
}

// equals and hash code not needed.
// if no comparable, then throws exception
// must implement comparable interface
class Vehicle implements Comparable<Vehicle>
{
	
	private String vehicleName;
	private String type;
	
	public Vehicle(String vehicleName, String type) {
		this.vehicleName = vehicleName;
		this.type = type;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "VehicleName:" + vehicleName + ", type:" + type;
	}
	
	//@Override
	public int compareTo(Vehicle o) {
		return this.vehicleName.length() - o.vehicleName.length();
	}
}