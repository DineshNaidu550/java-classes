package com.dinesh.practice.java.classes.subclasses;

public class ClassA {
	public int data =40;
	public void msg() {
		System.out.println("Hello java");
	}
	public class Simple{
		public static void main (String args[]) {
			ClassA obj = new ClassA();
			System.out.println(obj.data);
			obj.msg();
		}
	}

}
