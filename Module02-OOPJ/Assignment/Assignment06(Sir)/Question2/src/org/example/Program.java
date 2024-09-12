package org.example;

import java.util.Scanner;

public class Program {
	private static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		int arr[] = new int[5];
		
		Program.printRecord(arr);
		
		Program.acceptRecord(arr);
		Program.printRecord(arr);
		
		Program.sc.close();
	}

	public static void acceptRecord(int arr[]) {
		System.out.println("Enter 5 array elment : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}

	public static void printRecord(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}