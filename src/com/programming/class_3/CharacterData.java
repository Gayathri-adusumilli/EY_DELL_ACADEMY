package com.programming.class_3;

import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class CharacterData {

	public static void main(String[] args) {
		try {
			//File f = new File("C:/Files/ABC3.txt");
			//System.out.println(f.exists());
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File("C:/Files/ABC3.txt")));
			bw.write("ABCD");
			bw.newLine();
			bw.write("BLAHHHHH");
			bw.newLine();
			bw.write(97);
			bw.flush();
			bw.close();
			
			BufferedReader br = new BufferedReader(new FileReader(new File("C:/Files/ABC3.txt")));
			String str;
			
			while((str = br.readLine())!= null) {
				System.out.println(str);
			}
			br.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
