package com.example.demo.com.assignment24;

import java.util.ArrayList;
import java.util.Collections;

import com.assignment22.Employee;

public class EmployeeImp {

	public static void main(String[] args) {


		ArrayList<Employee> al = new ArrayList<Employee>();
		
		al.add(new Employee(102, "Bhushan", "Dhule", 500));
		al.add(new Employee(101, "Shubham", "Pune", 650));
		al.add(new Employee(104, "Rahul", "Mumbai", 830));
		al.add(new Employee(103, "Ram", "Surat", 561));
		al.add(new Employee(105, "Ajay", "Nashik", 486));
		
		Collections.sort(al);
		
		al.forEach(bk -> System.out.println(bk));

	}

}
