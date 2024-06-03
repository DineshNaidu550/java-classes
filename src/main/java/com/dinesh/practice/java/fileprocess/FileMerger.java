package com.dinesh.practice.java.fileprocess;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class FileMerger {

	private static String baseDir = "C:\\Users\\Chandragiddaiah M\\OneDrive\\Documents\\files_java\\File_Merge\\";

	public static void main(String[] args) throws Exception {
		String filePath = baseDir + "file1.txt";
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		filePath = baseDir + "file3.txt";
		PrintWriter pw = new PrintWriter(filePath);
		String line = br.readLine();
		while (line != null) {
			pw.println(line);
			line = br.readLine();
		}
		filePath = baseDir + "file2.txt";
		BufferedReader br1 = new BufferedReader(new FileReader(filePath));
		line = br1.readLine();
		while (line != null) {
			pw.println(line);
			line = br1.readLine();
		}
		pw.flush();
		br.close();
		pw.close();
		br1.close();
		System.out.println("Both files are merged successfully");
	}

}