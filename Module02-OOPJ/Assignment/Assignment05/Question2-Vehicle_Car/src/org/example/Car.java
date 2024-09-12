package org.example;

public class Car extends Vehicle {
	private String model;

	public Car(String make, int year, String model) {
		super(make, year);
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public void displayDetails() {
		System.out.println("Car Details : ");
        System.out.println("Make : " + this.getMake());
        System.out.println("Year : " + this.getYear());
        System.out.println("Model : " + this.model);
	}
}