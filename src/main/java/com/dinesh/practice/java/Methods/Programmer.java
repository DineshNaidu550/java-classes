package com.dinesh.practice.java.Methods;

class Programmer extends Employee {
	int bonus = 1000;

	public static void main(String[] args) {
		Programmer p = new Programmer();
		System.out.println("Programmer salary is:" + p.salary);
		System.out.println("Bonus of a programmer is:" + p.bonus);
	}

}
