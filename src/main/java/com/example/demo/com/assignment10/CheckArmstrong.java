package com.example.demo.com.assignment10;

import java.util.Scanner;

public class CheckArmstrong {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
	
		int n= a;
		int temp =n;
		int r;
		double sum=0;
		
		while(n>0) {
			
			r=n%10;
			sum= sum+ r*r*r;
			//sum= sum + Math.pow(r, r);
		
			n=n/10;
			
		}
		if(temp==sum) {
			
			System.out.println("number is armstrong");
		}
		else {
			System.out.println("number is not armstrong");
		}
		
		
	}

}
