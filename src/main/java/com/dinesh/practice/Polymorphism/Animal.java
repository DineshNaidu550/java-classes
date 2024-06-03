package com.dinesh.practice.Polymorphism;

class Animal {
	void eat() {
		System.out.println("I can eat");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("I can eat healthy food");
	}

	void smell() {
		System.out.println("I can smell everything");
	}
}
