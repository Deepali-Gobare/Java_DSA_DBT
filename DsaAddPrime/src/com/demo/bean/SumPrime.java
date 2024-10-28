package com.demo.bean;

public class SumPrime {
	public static int SumOfPrime(int [ ] a) {
		int sum = 0;
		for (int i : a) 
		if(isPrime(i)) 
		sum+=i;
		return sum;
			
	}
	
	public static boolean isPrime(int i) {
		if(i==0 || i == 1)
			return false;
		
		for (int j = 2; j < Math.sqrt(i)/2; j++) {
			if(i%j == 0)
				return false;
		}
		return true;
		
	}

}
