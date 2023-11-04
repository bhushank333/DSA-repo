package com.example.demo.com.multiplicationtable;

import java.util.Scanner;

public class CheckCharacter {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		char ch;
		
		System.out.println("Please enter input");
		
		 ch= sc.next().charAt(0);
		
		
		if(ch>='0' && ch<='9') {
			
			System.out.println("Given Character is number"+"   " +ch);
		}
		else if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
			System.out.println("Given Character is alphabet" +"   " +ch);
		}
		else {
			
			System.out.println("Given Character is special symbol" + "   " +ch);
			
		}
	}
	
}
