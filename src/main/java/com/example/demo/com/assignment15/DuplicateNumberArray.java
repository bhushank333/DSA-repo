package com.example.demo.com.assignment15;

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

	public static void main(String[] args) {

		int[] a ={10,20,50,20,10};
		getDuplicateNumberArray(a);
	}

}
