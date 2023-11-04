package com.example.demo.com.assignment15;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateInArray {

	//Remove duplicate using linkedHashMap
	public static void RemoveDuplicateUsingMap(int[] a, int n) {
		
		LinkedHashSet set = new LinkedHashSet<>();
		
		for(int i=0 ; i<a.length ; i++) {
			set.add(a[i]);
		}
		System.out.println(set);
	}
	

    public static void removeduplicates(int a[], int n) {
    	
    	int[] temp = new int[n];
    	int j=0;
    	
    	for (int i=0; i<n-1; i++){  
    	    if (a[i] != a[i+1]){  
    	        temp[j] = a[i];
    	        j++;
    	    }  
    	 }
    	temp[j++] = a[n - 1];
    	//temp[j++]= a[a.length-1];
    	//i<temp.length
    	for (int i=0; i<j; i++){  
             
        	System.out.println(temp[i]);
        }  
    
    }
	
	
	public static void main(String[] args) {
		int[] a ={10,20,50,20,10};
		Arrays.sort(a);
		int n= a.length;
		
//		RemoveDuplicateUsingMap(a, n);
		
		removeduplicates(a, n);
		
	}
	
}

//
//int[] temp = new int[n];  
//int j = 0;  
//for (int i=0; i<n-1; i++){  
//    if (arr[i] != arr[i+1]){  
//        temp[j++] = arr[i];  
//    }  
// }