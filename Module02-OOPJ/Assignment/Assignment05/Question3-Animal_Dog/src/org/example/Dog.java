package org.example;

public class Dog extends Animal {
	public Dog() {
		super("");
	}
	
	public Dog(String name) {
		super(name);
	}
	
	public void bark() {
		System.out.println(this.getName() + " is barking.");
	}
}
