package com.demo.beans;

import java.time.LocalDate;

public class MasterStudent extends Student {
	private String thesis;
	private String deg;
	private int tmarks;
	public MasterStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MasterStudent(int pid, String name, String addr, LocalDate bdt, int[] stuarr,String thesis,String deg,int tmarks) {
		super(pid, name, addr, bdt, stuarr);
		// TODO Auto-generated constructor stub
		this.thesis=thesis;
		this.deg=deg;
		this.tmarks=tmarks;
	}
	public String getThesis() {
		return thesis;
	}
	public void setThesis(String thesis) {
		this.thesis = thesis;
	}
	public String getDeg() {
		return deg;
	}
	public void setDeg(String deg) {
		this.deg = deg;
	}
	public int getTmarks() {
		return tmarks;
	}
	public void setTmarks(int tmarks) {
		this.tmarks = tmarks;
	}
	@Override
	public String toString() {
		return super.toString()+"MasterStudent [thesis=" + thesis + ", deg=" + deg + ", tmarks=" + tmarks + "]";
	}
	
		
}
