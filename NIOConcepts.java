package com.programming.class_3;

import java.io.*;
import java.nio.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIOConcepts {//not  executing

	public static void main(String[] args) throws IOException {
		Path p = Paths.get("C:/Files/ABC4.txt");
		System.out.println(p.getFileName());
		System.out.println(p.getFileSystem());
		System.out.println(p.getParent());
		System.out.println(p.getRoot());

		File f = p.toFile();
		System.out.println(f.getAbsolutePath());

		BufferedReader br = Files.newBufferedReader(p, StandardCharsets.UTF_8);
		String str = null;
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}

		Files.createFile(Paths.get("C:/Files/ABC4.txt"));
		System.out.println("File Created");
		
		Files.createDirectory(Paths.get("C:/Files/ABC4"));
		System.out.println("Directory Created");

		Files.createDirectories(Paths.get("C:/Files/ABC4/ABC6/ABC7"));
		System.out.println("Directory Created");
	}

}
