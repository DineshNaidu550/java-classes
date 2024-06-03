package com.dinesh.practice.java.classes;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Factorial number you needed");
		int num = sc.nextInt();
		int factNum = 1;

		for (int i = 1; i <= num; i++) {
			System.out.println("\t " + i);
			factNum = factNum * i;
		}
		System.out.println("Factorial of " + num + " is " + factNum);

		factNum = 1;
		for (int i = num; i >= 1; --i) {
			System.out.println(" \t " + i);

			factNum = factNum * i;
		}
		System.out.println("Factorial of " + num + " is " + factNum);

		sc.close();
	}

}
