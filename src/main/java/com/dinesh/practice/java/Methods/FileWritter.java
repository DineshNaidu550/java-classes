package com.dinesh.practice.java.Methods;

import java.io.*;

public class FileWritter {
	private static String baseDir = "C:\\Users\\Chandragiddaiah M\\OneDrive\\Documents\\files_java\\";

	public static void main(String[] args) throws IOException {
		String filename =baseDir +"Dinesh.txt";
			
			FileWriter fr =new FileWriter(filename);
			char[]ch= {'n','a','i','d','u'};
			fr.write(ch);
			fr.close();
			System.out.println("File writing is successful");
		}

	}


