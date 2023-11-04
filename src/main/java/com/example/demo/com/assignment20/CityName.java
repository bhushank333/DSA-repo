package com.example.demo.com.assignment20;

import java.util.ArrayList;

//2. Design the generics arraylist for string 
//and add five cities into it and iterate that using for each loop.


public class CityName {

	public static void main(String[] args) {
		
    ArrayList<String> al = new ArrayList<String>();
    
    al.add("Dhule");
    al.add("Pune");
    al.add("Mumbai");
    al.add("Hydrabad");
    al.add("Banglore");
    
    	for(String s : al) {
    		System.out.println(s);
    	}
		
	}

}
