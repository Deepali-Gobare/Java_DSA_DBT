package com.demo.test;

import java.util.Scanner;

import com.demo.service.StudentService;
import com.demo.service.StudentServiceImpl;

public class TestStudentListCollection {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	    StudentService s1= new StudentServiceImpl();
		int choice=0;
		do {
		System.out.println("1. add new student\n2. delete student by id\n 3. modify marks\n4. search by id");
		System.out.println("5. search by marks > given marks\n6. sort by id\n 7. sort by name\n8. sort by marks");
		System.out.println("9.display all\n10. search by name and display in sorted order\n 11. exit\nchoice:");
	    choice=sc.nextInt();
	    
	    switch(choice) {
	    
	    case 1->{  System.out.println("1. MasterStudent\n 2. GraduateStudent\n3. faculty\n choice: ");
                   int ch=sc.nextInt();
                   s1.addnewStudent(ch);}
	    case 2->{}
	    case 3->{}
	    case 4->{}
	    case 5->{}
	    case 6->{}
	    case 7->{}
	    case 8->{}
	    case 9->{}
	    case 10->{}
	    case 11 ->{}
	    
	    default->System.out.println("Thank you to visit our code...");
	    
	    }
	    
	    
		}while(choice!=11);
		
	
	}
	
}
