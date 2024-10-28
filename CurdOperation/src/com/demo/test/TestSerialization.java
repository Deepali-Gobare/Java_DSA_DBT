package com.demo.test;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import com.demo.beans.Employee;

public class TestSerialization {
	
	private static void writeFile(List<Employee> li) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file2122.dat")) ) {
			for (Employee employee : li) {
				oos.writeObject(employee);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void readFile(List<Employee> li) {
		// TODO Auto-generated method stub
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file2122.dat")) ) {
		 while(true)
		 {
			 Employee e = (Employee)ois.readObject();
			 System.out.println(e);			 
		 }
			
		}catch(EOFException e) {
			
//		 System.out.println(e.getMessage());
		 System.out.println("end of file reached.....");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> li = List.of(new Employee(1,"abc",55555,8888),new Employee(2,"xyz", 84864684, 68464),new Employee(3,"xyz", 84864, 6844));
		System.out.println("writing data from list to file");
		writeFile(li);
		System.out.println("Reading data from file");
		readFile(li);

	}

}
