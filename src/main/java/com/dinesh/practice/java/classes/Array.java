package com.dinesh.practice.java.classes;

public class Array {

	public static void main(String[] args) {

		int x[]= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Even number in the array");
		 for(int i=0;i<x.length;i++) {
			 
			 if(x[i]%2==0) {
				 System.out.println(x[i]);
			 }
		 }
		 System.out.println("Odd number in the array");
		 for(int i=0;i<x.length;i++) {
			 
			 if(x[i]%2!=0) {
				 System.out.println(x[i]);
			 }
		 }
	}

}
