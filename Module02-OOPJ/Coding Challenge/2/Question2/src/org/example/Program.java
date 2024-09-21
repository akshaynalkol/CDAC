package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array: ");
		int n = sc.nextInt();

		int arr[] = new int[n];
		System.out.print("Enter array element: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter value of k: ");
		int k = sc.nextInt();

		// 1
//		Arrays.sort(arr);
//
//		for (int i = n - 1; i >= n - k; i--) {
//			System.out.println(arr[i]);
//		}

		// 2
		for (int i = 0; i < arr.length; i++) {   // Selectiom Sort
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i = n - 1; i >= n - k; i--) {
			System.out.println(arr[i]);
		}

		sc.close();
	}
}
