package com.example.demo.com.assignment24;

import java.util.ArrayList;
import java.util.Collections;

public class StudentImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		al.add(new Student(104, "Bhushan", 450));
		al.add(new Student(206, "Shubham", 798));
		al.add(new Student(495, "Rahul", 546));
		al.add(new Student(267, "Ram", 634));
		al.add(new Student(135, "Ajay", 461));
		
		System.out.println("before sorting");
		al.forEach(bk -> System.out.println(bk));
		
		Collections.sort(al, new SalaryComparator());
		
		System.out.println("after sorting");
		
		al.forEach(bk -> System.out.println(bk));
	}

}
