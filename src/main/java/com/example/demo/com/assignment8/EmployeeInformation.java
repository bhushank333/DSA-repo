package com.example.demo.com.assignment8;

import java.util.Scanner;

public class EmployeeInformation {

	private String firstName ;
	
	private String lastName;
	
	private String city;
	
	private long mobileNumber;
	
	private static String country;
	
	
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public static String getCountry() {
		return country;
	}

	public static void setCountry(String country) {
		EmployeeInformation.country = country;
	}
	
	static void getUserInput() {
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter firstName ");
		String fName = sc.next();
		
		System.out.println("Enter lastName ");
		String lName = sc.next();

		System.out.println("Enter City ");
		String city = sc.next();
		
		System.out.println("Enter mobileNumber ");
		long Mnumber = sc.nextLong();
		
		System.out.println("Enter country ");
		String country = sc.next();
		
	

		EmployeeInformation emp = new EmployeeInformation();
		emp.setFirstName(fName);
		emp.setLastName(lName);
		emp.setCity(city);
		emp.setMobileNumber(Mnumber);
		emp.setCountry(EmployeeInformation.country);
		
		System.out.println("firstName is"+  "  " +emp.getFirstName());
		System.out.println("lastName is" +  "  " + emp.getLastName());
		System.out.println("city is"+  "  " + emp.getCity());
		System.out.println("mobile number is"+  "  " + emp.getMobileNumber());
		System.out.println("Country is" +  "  " +emp.getCountry());
	}
	
	
	public static void main(String[] args) {
		getUserInput();
		
		
	}
	
	
}
