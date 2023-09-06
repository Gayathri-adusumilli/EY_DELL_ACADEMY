package com.programming.class_3;

import java.io.IOException;
import java.io.*;//not executing
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class DeleteOneDirectory {

	public static void main(String[] args) throws IOException {
		Path P = Paths.get("C:Files/ABC.txt");
		//Files.delete(p);
		//System.out.println("One directory got deleted");
		
		Path p2 = Paths.get("C:Files/ABC");
		BasicFileAttributeView view = Files.getFileAttributeView(P, BasicFileAttributeView.class);
		BasicFileAttributes attr = view.readAttributes();
		
		FileTime creatingTime = attr.creationTime();
		System.out.println("creating time of my file is "+creatingTime);
		
		FileTime lastAccessTime =  attr.lastAccessTime();
		System.out.println("lastaccess btime of my file is "+lastAccessTime);
		

		FileTime modifiedtime =  attr.lastModifiedTime();
		System.out.println("lastaccess btime of my file is "+modifiedtime);
		

		
		

	}

}
