package com.dinesh.practice.java.fileprocess;

import java.io.*;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("abc.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		char[] ch1 = { 'a', 'b', 'c', 'd', 'e' };
		bw.write(ch1);
		bw.newLine();
		bw.write("durga");
		bw.newLine();
		bw.write("softwaresolutions");
		bw.flush();
		bw.close();
	}

}
