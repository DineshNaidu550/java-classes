package com.dinesh.practice.java.classes;

import java.io.File;
import java.io.IOException;

public class FileHandling {
	public static void main(String[] args) {
		File f = new File("f:\\FilesDemo.txt");
		try {
			if (f.createNewFile()) {
				System.out.println("File is created");
			} else {
				System.out.println("File is already exist");

			}
		} catch (IOException e) {
			System.out.println("An error occured");
			
			e.printStackTrace();
		}

		// System.out.println(f.createNewFile());
	}

}
