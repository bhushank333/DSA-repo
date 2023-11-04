package com.example.demo.com.assig15;

public class ArrayEx {

	static void removeDuplicate(int[] a) {
		int n = a.length;
		System.out.println(a[0]);
		for (int i = 1; i < n; i++) {
			boolean check = true;
			for (int j = 0; j < 1; j++) {
				if (a[i] == a[j]) {
					check =false;
					break;
				}
			}
		;

		}

	}
	
}


