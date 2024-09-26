package org.example;

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

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}

		float avg = sum / n;
		System.out.println(avg);

		for (int i = 0; i < n; i++) {
			if (avg < arr[i]) {
				System.out.println(arr[i]);
			}
		}

		sc.close();
	}
}