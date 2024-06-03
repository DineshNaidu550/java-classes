package com.dinesh.practice.java.fileprocess;

import java.io.*;

public class FileWriterDemo2 {
	

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("abc.txt");

		fw.write(100);
		fw.write("urga\n softwareSolutions");
		fw.write('\n');
		char[] ch = { 'a', 'b', 'c' };
		fw.write(ch);
		fw.write('\n');
		fw.flush();
		fw.close();
		
	}

}
