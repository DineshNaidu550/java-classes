package com.dinesh.practice.java.fileprocess;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class FileMerger2 {

	private static String baseDir = "C:\\Users\\Chandragiddaiah M\\OneDrive\\Documents\\files_java\\file_merge2\\";

	public static void main(String[] args) throws Exception {
		String filePath = baseDir + "file1.txt";
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		filePath = baseDir + "file2.txt";
		BufferedReader br1 = new BufferedReader(new FileReader(filePath));
		filePath = baseDir + "file3.txt";
		PrintWriter pw = new PrintWriter(filePath);
		String line1 = br.readLine();
		String line2 = br1.readLine();
		while (line1 != null || line2 != null) {
			if (line1 != null) {
				pw.println(line1);
			}
			if (line2 != null) {
				pw.println(line2);
			}
			line1 = br.readLine();
			line2 = br1.readLine();
		}
		pw.flush();
		br.close();
		pw.close();
		br1.close();
		System.out.println("Both files are merged successfully in the file merger2");
	}

}