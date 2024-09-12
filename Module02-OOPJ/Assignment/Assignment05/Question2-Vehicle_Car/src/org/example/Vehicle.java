package org.example;

public class Vehicle {
	private String make;
	private int year;

	public Vehicle(String make, int year) {
		this.make = make;
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return this.make + " " + this.year;
	}
}