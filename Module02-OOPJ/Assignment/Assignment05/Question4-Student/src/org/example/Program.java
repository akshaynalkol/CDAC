package org.example;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		// 1
		Scanner sc = new Scanner(System.in);
		Student s = new Student();

		System.out.print("Enter name : ");
		s.setName(sc.nextLine());
		System.out.print("Enter rollNo : ");
		s.setRollNo(sc.nextInt());
		sc.nextLine();
		System.out.print("Enter grade : ");
		s.setGrade(sc.nextLine());

		System.out.println(s.toString());
		
		
		// 2
		Student s2 = new Student("Rohan Mahangare", 42, "O");
        System.out.println(s2.toString());
	}
}