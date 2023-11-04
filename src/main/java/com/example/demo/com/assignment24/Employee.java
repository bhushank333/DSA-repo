package com.example.demo.com.assignment24;

//1. Suppose I have Employee class that containing I'd, name and city now 
//I want to sort the data based on comparable interface by using name.
//note this code is working refer assignment 22
public class Employee implements Comparable<Employee> {

	private int empID;
	
	private String empName;
	
	private String empCity;
	
	private int empSalary;

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", empCity=" + empCity + ", empSalary=" + empSalary
				+ "]";
	}

	public Employee(int empID, String empName, String empCity, int empSalary) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empCity = empCity;
		this.empSalary = empSalary;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.empName.compareTo(o.empName);
	}
	
	
	
	
	
}
