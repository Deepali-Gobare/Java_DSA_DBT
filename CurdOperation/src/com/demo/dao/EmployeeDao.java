package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;
import com.demo.exception.EmployeeNotFound;

public interface EmployeeDao {

	void readDataFile(String fname);

	void save(Employee e);

	List<Employee> findall();

	void writeToFile(String fname);

	boolean removeById(int a) throws EmployeeNotFound;

}
