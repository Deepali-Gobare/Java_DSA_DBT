package com.demo.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[]args) {
		List<Integer> lst = new ArrayList<>();
		lst.add(20);
		lst.add(30);
		lst.add(40);
		lst.remove(0);
		lst.clear();
		System.out.println(lst);
		System.out.println("Index Position : "+lst.indexOf(30));
		List<Integer> lst1 = List.of(1,2,3,4,5,6,7,8,9,0,11,22,33,44,55);
		lst1.stream().forEach(System.out::println);
	}

}
