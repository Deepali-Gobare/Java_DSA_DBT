package com.demo.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Employee;
import com.demo.exception.EmployeeNotFound;

public class EmployeeDaoImpl implements EmployeeDao {
	static List<Employee> elst;
	static {
		elst = new ArrayList<>();

	}

	@Override
	public void readDataFile(String fname) {
		// TODO Auto-generated method stub
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fname));) {
			while (true) {
				Employee e = (Employee) ois.readObject();
				elst.add(e);
			}
		} catch (EOFException e) {
			// TODO Auto-generated catch block
			System.out.println("end of the file");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void save(Employee e) {
             elst.add(e);
	}

	@Override
	public List<Employee> findall() {
		// TODO Auto-generated method stub
		return elst;
	}

	@Override
	public void writeToFile(String fname) {
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fname));){
			for(Employee e:elst) {
				oos.writeObject(e);
			}	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	@Override
	public boolean removeById(int a) throws EmployeeNotFound {
		boolean flag= elst.remove(new Employee(a));
		if(flag)
			return flag;
		throw new EmployeeNotFound("Not found "+a);
	}

}
