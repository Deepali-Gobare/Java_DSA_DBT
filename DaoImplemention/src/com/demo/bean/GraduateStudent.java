package com.demo.bean;

import java.time.LocalDate;

public class GraduateStudent extends Student {
	private int spsubmark;

	public GraduateStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GraduateStudent(int id, String name, String address, LocalDate bdate, int[] marks,int spsubmark) {
		super(id, name, address, bdate, marks);
		this.spsubmark = spsubmark;
		// TODO Auto-generated constructor stub
	}

	public int getSpsubmark() {
		return spsubmark;
	}

	public void setSpsubmark(int spsubmark) {
		this.spsubmark = spsubmark;
	}

	@Override
	public String toString() {
		return "GraduateStudent [spsubmark=" + spsubmark + "]";
	}


}
