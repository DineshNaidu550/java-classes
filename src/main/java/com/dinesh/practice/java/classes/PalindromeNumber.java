package com.dinesh.practice.java.classes;
import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		//Scanner sc = new Scanner (System.in);
		System.out.println("Please enter the number");
		//int num =sc.nextInt();
		int num =101;
		int temp=num;
		int r ,sum=0;
		while(num>0) 
		{
		r=num%10;
		num=num/10;
		sum =sum*10+r;
			
		}
		if(temp==sum) {
			System.out.println(  " is a Palindrome number");
		}
		else {
			System.out.println("not a Palindrome number");
		}

	}

}
