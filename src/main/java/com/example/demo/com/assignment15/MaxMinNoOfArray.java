package com.example.demo.com.assignment15;

public class MaxMinNoOfArray {
	
	public static int getMaxNumber(int[] a) {
		
		int max = a[0];
		
		for(int i=0 ; i<a.length ; i++) {
			if(a[i]>max) {
				max=a[i];
			}
			
		}
		return max;
	}
	
	public static int getMinNumber(int[] a) {
		
		int min=a[0];
		
		for(int i=0 ; i<a.length ;i++) {
			
			if(a[i]<min) {
				min=a[i];
			}
		}
		return min;
	}
	
	

	public static void main(String[] args) {
		
		int [] a= {2,8,6,7,9,4,3};
		System.out.println(" max element " + getMaxNumber(a));
		//getMaxNumber(a);
		System.out.println(" min element " + getMinNumber(a));

	}

}
