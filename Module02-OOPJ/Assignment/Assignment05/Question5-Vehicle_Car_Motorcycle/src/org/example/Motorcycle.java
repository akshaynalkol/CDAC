package org.example;

public class Motorcycle extends Vehicle {
	@Override
	public void startEngine() {
		System.out.println("Starting the motorcycle engine...");
	}
	
	@Override
	public void stopEngine() {
		System.out.println("Stopping the motorcycle engine...");
	}
}
