package com.example.demo.com.assignment24;

public class Student {

	private int StudentId;
	
	private String StudentName;
	
	private double StudentSalary;

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public double getStudentSalary() {
		return StudentSalary;
	}

	public void setStudentSalary(double studentSalary) {
		StudentSalary = studentSalary;
	}

	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentSalary=" + StudentSalary
				+ "]";
	}

	public Student(int studentId, String studentName, double studentSalary) {
		super();
		StudentId = studentId;
		StudentName = studentName;
		StudentSalary = studentSalary;
	}
	
	
	
	
}
