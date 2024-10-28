package com.demo.bean;

import java.time.LocalDate;

public class MasterStudent extends Student{
	private int  thesisMarks;
	private String subject;
	private String degree;
	
	
	public MasterStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MasterStudent(int id, String name, String address, LocalDate bdate, int[] marks,int thesisMarks,String subject,String degree) {
		super(id, name, address, bdate, marks);
		this.thesisMarks = thesisMarks;
		this.subject = subject;
		this.degree = degree;
		// TODO Auto-generated constructor stub
	}
	public int getThesisMarks() {
		return thesisMarks;
	}
	public void setThesisMarks(int thesisMarks) {
		this.thesisMarks = thesisMarks;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	@Override
	public String toString() {
		return "MasterStudent [thesisMarks=" + thesisMarks + ", subject=" + subject + ", degree=" + degree + "]";
	}
	
	

	
	

}
