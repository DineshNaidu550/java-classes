package com.dinesh.practice.java.Methods;

public class CalculatorMain {

	public static void main(String[] args) {

		Calculator cal =new Calculator();
		cal.sum();
		cal.addition(12, 30);
		System.out.println(cal.subtraction(39, 15, 20));
		System.out.println(cal.multiply(5,8));
	}

}
