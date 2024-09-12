package org.example;

class InstanceCounter {
	private static int count;

	public InstanceCounter() {
		InstanceCounter.count++;
	}

	public static int getCount() {
		return count;
	}

}

public class Program {
	public static void main(String[] args) {
		InstanceCounter obj1 = new InstanceCounter();
		InstanceCounter obj2 = new InstanceCounter();
		InstanceCounter obj3 = new InstanceCounter();

		System.out.println("Instance Counter : " + InstanceCounter.getCount());
	}

}