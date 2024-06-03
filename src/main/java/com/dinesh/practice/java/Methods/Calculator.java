package com.dinesh.practice.java.Methods;

public class Calculator {
	public void sum() {
		int a = 10;
		int b = 20;
		int result = a + b;
		System.out.println(result);
	}

	public void addition(int a, int b) {
		System.out.println(a + b);
	}

	public int subtraction(int a, int b, int c) {
		return a - b - c;
	}

	public long multiply(int a, long b) {
		return a * b;
	}

}
