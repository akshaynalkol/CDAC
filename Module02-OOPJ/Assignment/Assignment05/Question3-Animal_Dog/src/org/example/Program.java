package org.example;

public class Program {
	public static void main(String[] args) {
		// 1
		Animal animal1 = new Animal();
		animal1.setName("Lion");
		System.out.println("Name : " + animal1.getName());
		animal1.eat();
		animal1.sleep();

		Animal animal2 = new Animal("Cat");
		System.out.println("Name : " + animal2.getName());
		animal2.eat();
		animal2.sleep();

		
		// 2
		Dog dog1 = new Dog();
		dog1.setName("Don");
		System.out.println("Name : " + dog1.getName());
		dog1.bark();
		dog1.eat();
		dog1.sleep();
		
		Dog dog2 = new Dog("Tommy");
		System.out.println("Name : " + dog2.getName());
		dog2.bark();
		dog2.eat();
		dog2.sleep();
		
		
		// 3
		Animal a=new Dog();
		a.setName("XYZ");
		System.out.println("Name : " + a.getName());
		a.eat();
		a.sleep();
	}
}
