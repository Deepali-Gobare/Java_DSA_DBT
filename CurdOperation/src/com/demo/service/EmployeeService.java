package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;
import com.demo.exception.EmployeeNotFound;

public interface EmployeeService {

	void readFile(String string);

	void addnewEmployee();

	List<Employee> getAll();

	void writeFile(String string);

	boolean deleteById(int a) throws EmployeeNotFound;

}
