package com.springcore;

import java.util.List;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;

	private List<String> libraryBooks;
	
	

	public Student(int studentId, String studentName, String studentAddress, List<String> libraryBooks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.libraryBooks = libraryBooks;
	}


	public List<String> getLibraryBooks() {
		return libraryBooks;
	}


	public void setLibraryBooks(List<String> libraryBooks) {
		this.libraryBooks = libraryBooks;
	}


	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", libraryBooks=" + libraryBooks + "]";
	}

}
