package org.example;

public class Car extends Vehicle{
	@Override
	public void startEngine() {
		System.out.println("Starting the car engine...");
	}
	
	@Override
	public void stopEngine() {
		System.out.println("Stopping the car engine...");
	}    
}
