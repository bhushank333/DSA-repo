package com.example.demo.com.assignment22;

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

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", empCity=" + empCity + ", empSalary=" + empSalary
				+ "]";
	}

	public String getEmpName() {
		return empName;
	}

	public Employee(int empID, String empName, String empCity, int empSalary) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empCity = empCity;
		this.empSalary = empSalary;
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

	public Employee(int empID, String empName, String empCity) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empCity = empCity;
	}
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Employee o) {
		if(this.empID==o.empID) {
		return 0;
		}
		else if(this.empID>o.empID) {
			return 1;
		}
		else {
			return -1;
		}
		
		
	}

//	@Override
//	public int compareTo(Employee o) {
//		if(this.empSalary==o.empSalary) {
//		return 0;
//		}else if(this.empSalary>o.empSalary) {
//			return 1;
//		}else {
//			return -1;
//		}
//	}

//	@Override
//	public int compareTo(Employee o) {
//
//
//		return this.empName.compareTo(o.empName);
//	}

}
