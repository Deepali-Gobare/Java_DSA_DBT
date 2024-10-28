package com.demo.test;

import com.demo.bean.SumPrime;

public class TestSumPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SumPrime sp = new SumPrime();
		
		int [] arr = {14,11,2,98,19};
		
		int sumP = sp.SumOfPrime(arr); 
		
		System.out.println("Sum of primeNumber : " + sumP);

	}

}
