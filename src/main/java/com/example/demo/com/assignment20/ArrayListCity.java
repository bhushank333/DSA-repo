package com.example.demo.com.assignment20;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListCity {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		
		//[mumbai, pune, Bangalore, Hyderabad, mumbai],
		
		al.add("mumbai");
		al.add("pune");
		al.add("Bangalore");
		al.add("Hyderabad");
		al.add("mumbai");
		al.add("Hyderabad");
		
//		al.forEach(bk-> System.out.println(bk));
//		al.remove(4);
//		System.out.println("After Remove");
//		al.forEach(bk-> System.out.println(bk));
		
		HashSet<String> hs = new HashSet<String>(al);

		hs.forEach(bk-> System.out.println(bk));
	}

}
