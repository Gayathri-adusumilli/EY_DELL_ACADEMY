package com.programming.class_3;

import java.io.*;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectData {

	public static void main(String[] args) {
		String str = new String("String is a immutable class");
		Integer i = new Integer(12345);
		try {
			FileOutputStream fos = new FileOutputStream("C:/Files/ABC5.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream("C:/Files/ABC5.txt"));
			
			oos.writeObject(str);
			oos.writeObject(i);
			oos.close();
			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/Files/ABC5.txt"));
			System.out.println("String data is:" +(String) ois.readObject());
			System.out.println("String data is:" +(Integer) ois.readObject());
			ois.close();
		}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			
			catch(ClassNotFoundException c)
		{
				c.printStackTrace();

		}
		

	}

}
