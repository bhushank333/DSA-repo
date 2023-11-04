package com.example.demo.com.assignment7;

import java.util.Scanner;

public class FactorsOfNumber {

	public static void main(String[] args) {
     
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int x= sc.nextInt();
		
		factNum(x);
		
	}

	static void factNum(int no) {
		
		for(int i=1 ; i<=no ; i++) {
			
			if(no%i==0) {
				System.out.println(i +" ");
			}
		}
	}
	
	
}
