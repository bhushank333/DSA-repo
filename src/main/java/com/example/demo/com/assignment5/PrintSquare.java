package com.example.demo.com.assignment5;

import java.util.Scanner;

public class PrintSquare {
	public static void main(String[] args) {
		
		//PrintSquare ps = new PrintSquare();
		System.out.println("Enter Value");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		//ps.square(15);
			
		//PrintSquare.square(x);
		square(x);
	}
	
	static void square(int no) {
		int a = no*no;
		System.out.println("square is" +"  " +a);
	}
}

