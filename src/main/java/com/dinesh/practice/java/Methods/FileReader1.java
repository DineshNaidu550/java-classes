package com.dinesh.practice.java.Methods;

import java.io.*;

public class FileReader1 {
	private static String baseDir = "C:\\Users\\Chandragiddaiah M\\OneDrive\\Documents\\files_java\\";

	public static void main(String[] args) throws IOException {
		String filepath = baseDir + "Dinesh.txt";
		 File file =new File("Dinesh.txt");
		FileReader fr = new FileReader(filepath);

		char ch[] = { 'C', 'h', 'a', 'v', 'd', 'i' };
		fr.read(ch);
		fr.close();
		System.out.println("File reading is successful");
	}

}