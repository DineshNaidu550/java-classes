package com.dinesh.practice.java.fileprocess;

import java.io.*;

public class FileExtractor {
	private static String baseDir = "C://Users//Chandragiddaiah M//OneDrive//Documents//files_java//File_Extractor//";

	public static void main(String[] args) throws Exception {
       String filepath = baseDir+"output.txt";
		PrintWriter pw = new PrintWriter(filepath);
		filepath =baseDir+"input.txt";
		BufferedReader br1 = new BufferedReader(new FileReader(filepath));
		String line = br1.readLine();

		while (line != null) {
			boolean available = false;
			filepath =baseDir+"delete.txt";
			BufferedReader br2 = new BufferedReader(new FileReader(filepath));
			String target = br2.readLine();
			while (target != null) {
				if (line.equals(target)) {
					available = true;
					break;
				}
				target = br2.readLine();
			}
			if (available == false) {
				pw.println(line);
			}
			line = br1.readLine();
		}
		pw.flush();
	}

}
