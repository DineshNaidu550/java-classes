/*
 * Armstrong Number - Sum of cube of each digit in a number
 * 
 * This program takes a number(variable n) and computes cube of each digit in that number and 
 * sums up. Checks whether the input and output(sum of cube of digits) are equal,
 * if they are equal then prints the number as Armstrong number, if not prints not a 
 * Armstrong number
 */
package com.dinesh.practice.java.classes;

public class ArmStrongNumber {

	public static void main(String[] args) {

		int n = 153;
		int temp = n;
		int r, sum = 0;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			sum = sum + r * r * r;
		}
		if (temp == sum) {
			System.out.println("The given number "+temp+" is a Armstrong number");
		} else {
			System.out.println("The given number "+temp+" is not a Armstrong number");
		}
	}

}
