package org.example;

import java.util.ArrayList;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(20);
		list2.add(30);
		list2.add(40);
		list2.add(50);

		// 1
		List<Integer> mergeList1 = new ArrayList<Integer>();
		for (int i = 0; i < list1.size(); i++) {
			mergeList1.add(list1.get(i));
		}
		for (int i = 0; i < list2.size(); i++) {
			mergeList1.add(list2.get(i));
		}
		mergeList1.sort(null);
		System.out.println(mergeList1);

		// 2
		List<Integer> mergeList2 = new ArrayList<Integer>();
		int i = 0, j = 0;
		while (i < list1.size() && j < list2.size()) {
			if (list1.get(i) < list2.get(j)) {
				mergeList2.add(list1.get(i));
				i++;
			} else {
				mergeList2.add(list2.get(j));
				j++;
			}
		}
		while (i < list1.size()) {
			mergeList2.add(list1.get(i));
			i++;
		}
		while (j < list2.size()) {
			mergeList2.add(list2.get(j));
			j++;
		}
		System.out.println(mergeList2);
	}
}