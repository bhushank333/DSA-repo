package com.example.demo.com.assignment15;

import java.util.HashMap;
import java.util.HashSet;

public class DuplicateNumberArray {

	public static void getDuplicateNumberArray(int[] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[i]);
				}
			}

		}

	}

	public static void getDuplicateNumberArrayUsingHashMap(int[] a) {
		HashSet<Integer> seen = new HashSet<>();
		HashSet<Integer> duplicates = new HashSet<>();

		for (int num : a) {
			if (!seen.add(num)) {
				duplicates.add(num);  // Already seen, so it's a duplicate
			}
		}

		duplicates.forEach(System.out::println);
	}

	public static void getDuplicateNumberArrayUsingMap(int[] a) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int num : a) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		for (var entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}
	}


	public static void main(String[] args) {

		int[] a ={10,20,50,20,10};
		getDuplicateNumberArray(a);
		getDuplicateNumberArrayUsingHashMap(a);
		getDuplicateNumberArrayUsingMap(a);
	}

}
