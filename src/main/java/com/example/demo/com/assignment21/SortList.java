package com.example.demo.com.assignment21;

//1. Design the method which return the list that contain the element as Ram, Sohan, Ashok, Ajay, Prasanna 
//		now I want to sort that element based on descending order.

import java.util.ArrayList;
import java.util.Collections;

public class SortList {
	
	public static ArrayList<String> getArrayList(){
		
		ArrayList<String> al = new ArrayList<String>();
		
	//	Ram, Sohan, Ashok, Ajay
		
//		al.add("Ram");
//		al.add("Sohan");
//		al.add("Ashok");
//		al.add("Ajay");
		
			al.add("Geeks");
	        al.add("For");
	        al.add("ForGeeks");
	        al.add("GeeksForGeeks");
	        al.add("A computer portal");
		
		Collections.sort(al, Collections.reverseOrder());
		//Collections.sort(al);
		
		return al;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getArrayList().forEach(bk-> System.out.println(bk));
	}
	
}
