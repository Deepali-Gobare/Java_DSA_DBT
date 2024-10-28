package com.demo.beans;

import java.time.LocalDate;
import java.util.Arrays;

public class Student extends Person {
	protected int[] stuarr;

	public Student() {
		super();
		
	}

	public Student(int pid, String name, String addr, LocalDate bdt,int[] stuarr) {
		super(pid,name,addr,bdt);
		this.stuarr = stuarr;
	}

	public int[] getStuarr() {
		return stuarr;
	}

	public void setStuarr(int[] stuarr) {
		this.stuarr = stuarr;
	}

	@Override
	public String toString() {
		return super.toString()+"Student [stuarr=" + Arrays.toString(stuarr) + "]";
	}
	

}
