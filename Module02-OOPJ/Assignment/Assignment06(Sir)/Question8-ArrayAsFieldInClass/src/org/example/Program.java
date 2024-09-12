package org.example;

import java.util.Arrays;
import java.util.Scanner;

class Array {
	private int arr[];
	private static Scanner sc = new Scanner(System.in);

	public Array(int size) {
		this.arr = new int[size];
	}

	public void setArray() {
		System.out.println("Enter Array Element :");
		for (int i = 0; i < this.arr.length; i++) {
			this.arr[i] = sc.nextInt();
		}
	}

	public int[] getArray() {
		return this.arr;
	}
}

public class Program {
	public static void main(String[] args) {
		Array arr = new Array(5);
		
		arr.setArray();
		
		System.out.println("Arrray Elements : "+Arrays.toString(arr.getArray()));
	}
}
