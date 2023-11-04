package com.example.demo.com.assignment15;

public class SortArray {
	
	public static void getSortArray(int[] a) {
		
		int temp =0;
		
		for(int i=0 ; i<a.length ; i++) {
			for(int j=i+1 ; j<a.length; j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
		}
		for(int b : a) {
		System.out.println(b);
		}
		System.out.println("Maximum No:" + a[a.length-1]);
		
	}
	
	public static void main(String[] args) {
		
		int [] a= {2,8,6,7,9,4,3};
		
		getSortArray(a);
		
		
	}
	

}
