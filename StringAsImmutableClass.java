package com.programming.class_1;

public class StringAsImmutableClass {

	public static void main(String[] args) {
		String str = new String("ABC");
		System.out.println("1- the value of the string is:" +str);
		str.concat("XYZ");
		System.out.println("2- the value of the string is:" +str);
		str.replace("A", "X");
		System.out.println("3- the value of the string is:" +str);
		str.concat("PQR");
		System.out.println("4- the value of the string is:" +str);
		
		//jdk 1.1 - synchronized - thread safe
		StringBuffer sb = new StringBuffer("ABC");
		System.out.println("5- the value of the string is:" +sb.toString());
		sb.append("XYZ");
		System.out.println("6- the value of the string is:" +sb.toString());
		
		//jdk 1.5 - Fast
		StringBuilder sb2 = new StringBuilder("MNO");
		System.out.println("7- the value of the string is:" +sb2.toString());
		sb2.append("XYZ");
		System.out.println("8- the value of the string is:" +sb2.toString());
		
	}

}
