package com.oops.basic;

public class Student {
    String employeeName;
    String employeeId;

	public Student(String employeeName,String employeeId) {
	this.employeeName=employeeName;
	this.employeeId=employeeId;
		
	}
	void printDetails()
	{
		System.out.println("Employee Name is"+" "+employeeName);
		System.out.println("Employee ID is"+" "+employeeId);

	}
	
	
	
}
