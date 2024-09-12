package org.example;

import java.util.Arrays;

public class Program {
	public static void main(String[] args) {
		int arr1[] = {1, 3, 4, 5, 7};
        int arr2 []= {2, 3, 5, 6};

		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int n1 = arr1.length;
		int n2 = arr2.length;
		
		int i = 0, j = 0;
		while (i < n1 && j < n2) {
			if (arr1[i] == arr2[j]) {
				System.out.print(arr1[i]+" ");
				i++;
				j++;
			} else if (arr1[i] < arr2[j]) {
				i++; 
			} else {
				j++;
			}
		}
	}

}
