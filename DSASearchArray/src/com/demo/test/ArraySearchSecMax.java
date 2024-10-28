package com.demo.test;

import java.util.Arrays;

public class ArraySearchSecMax {
        public static int secondMax(int[] arr) {
        	Arrays.sort(arr);
        	int secMax=arr[arr.length-2];	
        	return secMax;
        }
        
        public static int secondMin(int[] arr) {
        	Arrays.sort(arr);
        	int secMin=arr[1];	
        	return secMin;
        }
        
        public static int secondMax1(int[]arr) {
        	int max = arr[0] ; int xmax = arr[0];
        	
        	for (int i = 0; i < arr.length; i++) {
				if(arr[i]>max) {
					xmax=max;
					max=arr[i];
				}
				if(arr[i]>xmax && arr[i]<max) {
					xmax=arr[i];
				}
			}
        	return xmax;
        	
        }

}
