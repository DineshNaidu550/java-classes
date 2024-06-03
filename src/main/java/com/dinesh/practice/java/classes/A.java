package com.dinesh.practice.java.classes;

public class A {
	final int x = 9;

	void mx() {
		final int y = 99;
		System.out.println(y);
	}

	public static void main(String[] args) {

		A aa = new A();
		aa.mx();
	}

}
