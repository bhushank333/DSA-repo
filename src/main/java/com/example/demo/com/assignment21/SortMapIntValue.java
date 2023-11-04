package com.example.demo.com.assignment21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//18. Suppose I have Map<String,Integer> contain key as Ram, Sohan, Ashok, Ajay, Prasanna and value is 3,2,1,6,5 now 
//I want to sort the value from map and print it.

public class SortMapIntValue {
	
	
	public static HashMap<String, Integer> SortByValue(HashMap<String, Integer> hm){
		
		ArrayList<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(hm.entrySet());
		
	
        // Sort the list using Comparator
//		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
//
//			@Override
//			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//
//				
//				return o1.getValue().compareTo(o2.getValue());
//			}
//			
//		});
		
		  // Sort the list using lambda expression
		//Collections.sort(list,(i1,i2) -> i1.getValue().compareTo(i2.getValue()));
		
		Collections.sort(list, (i1,i2)-> i1.getValue().compareTo(i2.getValue()));
		
		HashMap<String, Integer> hsh = new LinkedHashMap<String , Integer>();
		for(Map.Entry<String, Integer> it : list) {
			hsh.put(it.getKey(), it.getValue());
		}
		return hsh;
	}
	
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
//		hm.put("Ram", 3);
//		hm.put("Sohan", 2);
//		hm.put("Ashok", 1);
//		hm.put("Ajay", 6);
//		hm.put("Prasanna", 5);
		
		hm.put("Math", 98);
        hm.put("Data Structure", 85);
        hm.put("Database", 91);
        hm.put("Java", 95);
        hm.put("Operating System", 79);
        hm.put("Networking", 80);
		
		
		SortByValue(hm).forEach((k,v)-> System.out.println(k + "  :  "+ v));
		
	}

}
