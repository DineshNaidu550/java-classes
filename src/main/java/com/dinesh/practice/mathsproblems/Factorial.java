package com.dinesh.practice.mathsproblems;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number you needed");
		int in = sc.nextInt();
		int fact = 1;

		for (int i = in; i >=1; --i) {
			System.out.println("\t "+i);

			fact = fact * i;
		}

		System.out.println("Factorial of " + in + "is" + fact);
	}

}
