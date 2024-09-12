package org.example;

import java.util.Arrays;

public class Program {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 7, 5 };

		// 1
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Max Element : " + max);
		
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Min Element : " + min);
		
		
		// 2
		Arrays.sort(arr);
		System.out.println("Max Element : " + arr[arr.length-1]);
		System.out.println("Min Element : " + arr[0]);
	}
}
