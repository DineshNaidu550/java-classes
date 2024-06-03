package com.dinesh.practice.java.fileprocess;

import java.io.*;

public class PrintWriterDemo1 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("abc.txt");
		PrintWriter pw = new PrintWriter(fw);
		System.out.write(100);
		System.out.println(100);
		System.out.println(true);
		System.out.println('c');
		System.out.println("durga");
		System.out.flush();
		System.out.close();
	}

}
