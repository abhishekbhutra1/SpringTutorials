package com.springcore.cipractice;

import java.util.List;

public class Student {

	private int studentId;
	private String studentName;
	private Address studentAddress;
//	private List<String> courses;
	
	public Student(int studentId, String studentName, Address studentAddress) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
//		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress+ "]";
	}
	
	
}
