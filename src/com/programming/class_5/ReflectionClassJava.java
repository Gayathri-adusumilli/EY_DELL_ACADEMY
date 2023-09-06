package com.programming.class_5;

class Sampleclass{}
interface MyInterface{}


public class ReflectionClassJava {
	void printName(Object obj) {
		Class c = obj.getClass();
		System.out.println(c.getCanonicalName());
		System.out.println(c.getName());
	}

	public static void main(String[] args) throws ClassNotFoundException{
		Sampleclass obj = new Sampleclass();
		 ReflectionClassJava rc = new  ReflectionClassJava();
		 rc.printName(obj);
		 
		 Class c = boolean.class;
		 System.out.println(c.getName());
		 
		 Class c2 = ReflectionClassJava.class;
		 System.out.println(c2.getName());

		 Class c4 = Class.forName("com.programming.class_5.ReflectionClassJava");
		 System.out.println(c4.getName());


		 

	}

}
