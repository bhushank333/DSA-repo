package com.example.demo.com.assignment14;

public class MultiplicationTable {

	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	
		for(int i=0 ; i<a.length ; i++) {
			for(int j=1 ; j<=10; j++ ) {
				System.out.println(a[i]*j +" ");
				
			}
			
		}
		
	}

}

