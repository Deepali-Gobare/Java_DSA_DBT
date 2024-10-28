package com.demo.beans;

import java.time.LocalDate;

public class Person {
	private int pid;
	private String name;
	private String addr;
	private LocalDate bdt;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int pid, String name, String addr, LocalDate bdt) {
		super();
		this.pid = pid;
		this.name = name;
		this.addr = addr;
		this.bdt = bdt;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public LocalDate getBdt() {
		return bdt;
	}
	public void setBdt(LocalDate bdt) {
		this.bdt = bdt;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", addr=" + addr + ", bdt=" + bdt + "]";
	}
	

}
