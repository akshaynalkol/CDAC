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

		System.out.print("Enter value of k: ");
		int k = sc.nextInt();
		int res = 0;

		for (int i = 0; i <= n - k; i++) {
			int temp[] = new int[k];
			int l = 0;
			for (int j = i; j < k + i; j++) {
				temp[l++] = arr[j];
			}
			if (k % 2 == 0) {
				res = (temp[k / 2] + temp[(k / 2) - 1]) / 2;
			} else {
				res = temp[k / 2];
			}
			System.out.print(res + " ");
		}

		sc.close();
	}
}