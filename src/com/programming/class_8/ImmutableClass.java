package com.programming.class_8;

public class ImmutableClass {

	public static void main(String[] args) {
		String str = new String("ABC");
		System.out.println("First step:"+str);
		str = str.concat("XYZ");
		System.out.println("Second step:"+str);
	

	StringBuilder sb = new StringBuilder("ABC");
	System.out.println("First step:"+str);
	sb.append("XYZ");
	System.out.println("Second step:"+sb.toString());
}
}
