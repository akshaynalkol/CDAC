package org.example;

public class Program {
	public static void main(String[] args) {
		Vehicle car = new Car(); // Upcasting
		car.startEngine();
		car.stopEngine();

		Car c = (Car) car; // Downcasting
		c.startEngine();
		c.startEngine();

		Vehicle motorcycle = new Motorcycle(); // Upcasting
		motorcycle.startEngine();
		motorcycle.stopEngine();

		Motorcycle m = (Motorcycle) motorcycle; // Downcasting
		m.startEngine();
		m.startEngine();
	}
}