package com.dinesh.practice.java.fileprocess;

import java.io.*;

public class CharArrayWriterDemo {

	public static void main(String[] args) throws IOException {
		CharArrayWriter caw = new CharArrayWriter();
		String s = "This should end up in the array";
		char buf[] = new char[s.length()];
		s.getChars(0, s.length(), buf, 0);
		try {
			caw.write(buf);
		} catch (IOException e) {
			System.out.println("Error writing to buffer");
			return ;
		}
		System.out.println("Buffer as a String");
		System.out.println(caw.toString());
		System.out.println("Into Array");

		char c[] = caw.toCharArray();
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		System.out.println("\nTo a FileWriter()");
		try (FileWriter f2 = new FileWriter("test.txt")) {
			caw.writeTo(f2);
		} catch (IOException e) {
			System.out.println("I/O Error:" + e);
		}
		System.out.println("Doing a reset");
		caw.reset();
		for (int i = 0; i < 3; i++)
			caw.write('X');
		System.out.println(caw.toString());

	}

}
