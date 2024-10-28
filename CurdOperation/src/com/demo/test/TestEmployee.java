package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeServceImpl;
import com.demo.service.EmployeeService;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int choice = 0;
		EmployeeService eser = new EmployeeServceImpl();

		eser.readFile("file2122.dat");

		do {
			System.out.println("1. Add new Employee\n2. delete Employee\n3. update employee\n");
			System.out.println("4. display all\n5.exit\nchoice:");
			choice = sc.nextInt();
			switch (choice) {
			case 1 -> {
				eser.addnewEmployee();
			}
			case 2 -> {
				try {
					System.out.println("Enter the id");
					int a = sc.nextInt();
					boolean status = eser.deleteById(a);
					if (status) {
						System.out.println("Object is delete");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
			case 3 -> {
			}
			case 4 -> {
				List<Employee> elst = eser.getAll();
				elst.stream().forEach(System.out::println);
			}
			case 5 -> {
				eser.writeFile("file2122.dat");
				System.out.println("thank you for visiting....");
				sc.close();
			}
			}
		} while (choice != 5);
	}
}
