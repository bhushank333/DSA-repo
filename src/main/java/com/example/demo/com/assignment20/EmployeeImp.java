package com.example.demo.com.assignment20;

//3. Design the method for ArrayList<Employee> which returns the list of employee 
//and print that data.

import java.util.ArrayList;

public class EmployeeImp {
	
	public static ArrayList<Employee> getEmployee(){
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		al.add(new Employee(101, "Bhushan", 500));
		al.add(new Employee(102, "Shubham", 600));
		al.add(new Employee(103, "Rahul", 700));
		al.add(new Employee(104, "Ram", 900));
		al.add(new Employee(105, "Pranav", 350));
		
		return al;
	}

	public static void main(String[] args) {
		
		//System.out.println(getEmployee());
				
		//getEmployee().forEach(bk-> System.out.println(bk));
		
//		for (Employee e : getEmployee()) {
//			
//			System.out.println(e);
//			
//		}
		
		//getEmployee().forEach(System.out::println);
	}
	
}
