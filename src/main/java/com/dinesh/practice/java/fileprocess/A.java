package com.dinesh.practice.java.fileprocess;

import java.io.*;

public class A {

	public static void main(String[] args) throws IOException  {
		try {
		File file = new File("abc.txt");
		FileReader fr = new FileReader(file);
		char ch []=new char[5];
			fr.read(ch);
			for(char c:ch) {
				System.out.println(c);
			}
			fr.close();
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}
