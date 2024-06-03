package com.dinesh.practice.java.classes;

import com.dinesh.practice.java.classes.subclasses.ClassA;

public class Simple{
	public static void main (String args[]) {
		ClassA obj = new ClassA();
		System.out.println(obj.data);
		obj.msg();
	}
}
