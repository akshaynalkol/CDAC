package org.example;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter no1: ");
		int no1 = scanner.nextInt();

		System.out.print("Enter no2: ");
		int no2 = scanner.nextInt();
		
		// 1
//		int temp = 0;
//		while (no1 != no2) {
//			if (no1 > no2) {
//				temp = no1 - no2;
//				no1 = temp;
//			} else {
//				temp = no2 - no1;
//				no2 = temp;
//			}
//		}
//		System.out.println("Euclidean No is: " + no1);
		
		
		// 2
		while (no2 != 0) {
            int temp = no2;
            no2 = no1 % no2;
            no1 = temp;
        }
		System.out.println("Euclidean No is: " + no1);
	}
}