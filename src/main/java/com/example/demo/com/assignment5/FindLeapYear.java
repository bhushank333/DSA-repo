package com.example.demo.com.assignment5;

public class FindLeapYear {

		public static void main(String[] args) {
			int year = 3000;
			
			if(year%4==0 || year%100==0 ) {
				
				System.out.println("This is leap year"+ " " +year);
			}
			else {
				
				System.out.println("This is not leap year"+ " " +year);
			}
		}
}
