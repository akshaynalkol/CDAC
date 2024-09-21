package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter The Number Of Integers : ");
		int n = sc.nextInt();

		List<Integer> list = new ArrayList<Integer>();
		 System.out.println("Enter The Integers : ");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		
		Set<Integer> set=new HashSet<Integer>();
		List<Integer> res=new ArrayList<Integer>();
		for(int ele:list) {
			if(!set.add(ele)) {
				res.add(ele);
			}
		}
		
		System.out.println("Duplicate Integers : "+res);
	}
}