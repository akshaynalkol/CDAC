package org.example;

import java.util.Arrays;
import java.util.Scanner;

class Array {
	private int arr[];
	private static Scanner sc = new Scanner(System.in);

	public Array(int size) {
		this.arr = new int[size];
	}

	public void acceptRecord() {
		System.out.println("Enter Array Element :");
		for (int i = 0; i < this.arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}

	public void printRecord() {
		System.out.println("Arrray Elements : ");
		System.out.println(Arrays.toString(this.arr));
	}

}

public class Program {
	public static void main(String[] args) {
		Array arr = new Array(5);
		arr.acceptRecord();
		arr.printRecord();
	}
}
