package com.example.demo.com.assignment20;

//1. Write program to add the five students mobile number into arraylist 
//and iterate that elements using iterator. 

import java.util.ArrayList;
import java.util.Iterator;

public class StudentNumber {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("9623546707");
		al.add("9637389645");
		al.add("9823578456");
		al.add("8263542984");
		al.add("7972582520");
		
				Iterator<String>  itr=	al.iterator();
				
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
		
	}

}
