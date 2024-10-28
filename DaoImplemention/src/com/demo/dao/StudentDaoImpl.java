package com.demo.dao;

import java.time.LocalDate;
import java.util.List;

import com.demo.bean.GraduateStudent;
import com.demo.bean.MasterStudent;
import com.demo.bean.Student;

public class StudentDaoImpl implements StudentDao {
	private static List<Student> studList;
	static {
		studList.add(new GraduateStudent(101,"ABCD","Pune",LocalDate.of(2000, 1, 1),new int[] {20,12},70));
		studList.add(new GraduateStudent(102,"XYZ","Pune",LocalDate.of(2001, 3, 2),new int[] {40,17},75));
		studList.add(new MasterStudent(103,"RRRR","Katraj",LocalDate.of(2002, 4, 1),new int[] {22,33},55,"Bio","BioTech"));
	}
	

}
