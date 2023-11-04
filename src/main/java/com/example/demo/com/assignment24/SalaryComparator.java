package com.example.demo.com.assignment24;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.getStudentSalary()==o2.getStudentSalary()) {
		return 0;
		}
		else if(o1.getStudentSalary()>o2.getStudentSalary()) {
			return 1;
		}else {
			return -1;
		}
	}
	
	

}
