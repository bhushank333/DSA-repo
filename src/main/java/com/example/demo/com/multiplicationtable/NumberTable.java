package com.example.demo.com.multiplicationtable;

public class NumberTable {

	public static void main(String[] args) {
		NumberTable num = new NumberTable();
		
		num.multiplication(5);
		
		
	}
	void multiplication(int no) {
		
		for(int i=1 ; i<=10 ; i++) {
			
			int a= no*i;
			
			System.out.println(a);
		}
	}

}
	

