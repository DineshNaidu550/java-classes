package com.dinesh.practice.java.fileprocess;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	
	private static String baseDir = "C://Users//Chandragiddaiah M//OneDrive//Documents//files_java";
	
	public static void main(String[] args) throws Exception {
		
		String filePath = baseDir + "//" + "file1.txt";
		File file = new File(filePath);
		File fileDir = new File(baseDir);
		
		if(fileDir.isDirectory()) {
			System.out.println(" list of file in "+baseDir);
			File[] files = fileDir.listFiles();
			for(File f: files) {
				System.out.println(f.getName());
			}
		}
		
		if(file.isFile() && file.exists()) {
			try(BufferedReader br = new BufferedReader(new FileReader(file) )) {
				
				String line;
				int lineNum=1;
				boolean isFirstLine = true;
				while((line = br.readLine()) != null) {
					if(isFirstLine) {
						isFirstLine = false;
						continue;
					}
					System.out.println(lineNum+". "+line);
					lineNum++;
				}
			} catch (FileNotFoundException e) {
				System.out.println(" FileNotFoundException occured"+e.getMessage());
			} catch (IOException e) {
				System.out.println(" IOException occured"+e.getMessage());
			}
		} else {
			System.out.println(" File is not exist "+filePath);
		}
	}

}
