package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;
import com.demo.exception.EmployeeNotFound;

public class EmployeeServceImpl implements EmployeeService {
	private EmployeeDao edao;

	public EmployeeServceImpl() {
		edao = new EmployeeDaoImpl();
	}

	@Override
	public void readFile(String fname) {
		// TODO Auto-generated method stub
		edao.readDataFile(fname);
	}

	@Override
	public void addnewEmployee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("enter sal");
		double sal=sc.nextDouble();
		Employee e=new Employee(id,nm,sal,sal*0.10);
		edao.save(e);
		
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return edao.findall();
	}

	@Override
	public void writeFile(String fname) {
		edao.writeToFile(fname);
		
	}

	@Override
	public boolean deleteById(int a) throws EmployeeNotFound {
		return edao.removeById(a);
	}

}
