package com.example.demo.com.multiplicationtable;

import java.util.Scanner;

public class EvenNumber {
	
	public static void main(String [] args) {
		
		EvenNumber en = new EvenNumber();
		
		en.even(75);
			
		}

	void even(int no) {
		
		for(int i=50; i<=no; i++) {
			
			if(i%2==0) {
				
				System.out.println("No is even"+ i);	
				
			}
		}
	}
	
}



