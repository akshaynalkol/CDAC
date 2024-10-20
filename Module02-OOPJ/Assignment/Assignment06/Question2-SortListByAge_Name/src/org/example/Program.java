package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person() {
		this("", 0);
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person obj) {
		if (this.age == obj.age) {
			return this.name.compareTo(obj.name);
		}
		return this.age - obj.age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}

public class Program {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person("Purvesh", 22));
		list.add(new Person("Sainath", 23));
		list.add(new Person("Ganesh", 24));
		list.add(new Person("Aman", 22));
		
//		for(Person ele:list) {
//			System.out.println(ele);
//		}
		
		// list.sort(null);
		Collections.sort(list);
		
		for(Person ele:list) {
			System.out.println(ele);
		}
	}
}