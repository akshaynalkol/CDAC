package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter The String : ");
		String str=sc.next();
		
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(map.get(c)==1) {
				System.out.println(c);
				break;
			}
		}
	}
}