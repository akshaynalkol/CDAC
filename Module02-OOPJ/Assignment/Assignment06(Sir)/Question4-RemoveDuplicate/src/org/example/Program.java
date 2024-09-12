package org.example;

import java.util.Arrays;

public class Program {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 1, 3, 2, 5 };
		
        Arrays.sort(arr);

        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                arr[++j] = arr[i];
            }
        }
        
        int[] res = new int[j+1];
        for(int i=0;i<res.length;i++) {
        	res[i]=arr[i];
        }
        
        System.out.println(Arrays.toString(res));
	}
}
