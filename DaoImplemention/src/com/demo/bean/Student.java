package com.demo.bean;

import java.time.LocalDate;
import java.util.Arrays;

public class Student extends Person{
	private int[] marks;
	
	

	public Student() {
		super();
	}


	public Student(int id, String name, String address, LocalDate bdate,int[] marks) {
		super(id, name, address, bdate);
		this.marks = marks;
		// TODO Auto-generated constructor stub
	}


	public int[] getMarks() {
		return marks;
	}


	public void setMarks(int[] marks) {
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [marks=" + Arrays.toString(marks) + "]";
	}
	
	

}
