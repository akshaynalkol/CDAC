package org.example;

public class Animal {
	private String name;
	
	public Animal() {
		this.name="";
	}

	public Animal(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name=name;
	}

	public String getName() {
		return this.name;
	}

	public void eat() {
		System.out.println(this.name + " is eating.");
	}

	public void sleep() {
		System.out.println(this.name + " is sleeping.");
	}
}
