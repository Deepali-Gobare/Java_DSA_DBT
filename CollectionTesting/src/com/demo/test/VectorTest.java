package com.demo.test;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>(20,3);
		v.add(10);
		v.add(11);
		v.add(12);
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
		for(int i=0;i<10;i++) {
			v.add(i+10);
		}
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
		for(int i=0;i<10;i++) {
			v.add(i+20);
		}
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
	}

}
