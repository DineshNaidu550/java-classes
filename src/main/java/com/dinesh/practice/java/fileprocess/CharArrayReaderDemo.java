package com.dinesh.practice.java.fileprocess;

import java.io.*;

public class CharArrayReaderDemo {

	public static void main(String[] args) {
		String temp = "abcdefghijklmnopqrstuvwxyz";
		int length = temp.length();
		char c[] = new char[length];
		temp.getChars(0, length, c, 0);
		int i;
		try (CharArrayReader input1 = new CharArrayReader(c)) {
			System.out.println("input1 is:");
			while ((i = input1.read()) != -1) {
				System.out.println((char) i);
			}
			System.out.println();
		} catch (IOException e) {
			System.out.println("I/o Error: " + e);
		}
		try (CharArrayReader input2 = new CharArrayReader(c, 0, 10)) {
			System.out.println("input2 is :");
			while ((i = input2.read()) != -1) {
				System.out.println((char) i);
			}
			System.out.println();

		} catch (IOException e) {
			System.out.println("I/O Error:" + e);
		}
	}
}