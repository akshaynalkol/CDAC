package org.example;

public class Program {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 4, 5 };

		int n = arr.length + 1;
		int sum1 = (n * (n + 1)) / 2;

		int sum2 = 0;
		for (int i = 1; i < arr.length; i++) {
			sum2 += arr[i];
		}
		
		System.out.println("Missing No. : "+(sum1-sum2));
	}
}