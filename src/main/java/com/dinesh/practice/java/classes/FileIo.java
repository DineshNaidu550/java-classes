package com.dinesh.practice.java.classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileIo {

	public static void main(String[] args) {

		try {
			BufferedWriter bf = new BufferedWriter(new FileWriter("output.txt"));
			bf.write("writing to a file");
			bf.write("writing a another file");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
