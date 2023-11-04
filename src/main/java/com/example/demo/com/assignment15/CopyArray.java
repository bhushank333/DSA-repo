package com.example.demo.com.assignment15;

public class CopyArray {
	
	public static void main(String[] args) {
		
		int[] a= {2,8,6,7,9,4,3};
		int[] b=a.clone();
		
		for(int k : b) {
			System.out.println(k);
		}
	}

}
