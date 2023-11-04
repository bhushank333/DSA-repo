package com.example.demo.com.assig15;

// Q. Program to print the duplicate elements of an array.


public class DuplicateElement {

	static void GetDuplicateElement(int[] a) {
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println("Duplicate Element" + a[i]);
				}
			}
		}

	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 2, 7, 8, 8, 3,5,7,5,9,9 };
		int b = a.length;
		System.out.println(b);
		GetDuplicateElement(a);
		
		for (int k=a.length-1 ; k>=0; k--) {
			System.out.println(a);
		}

	}
}
