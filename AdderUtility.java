package com.programming.class_3;

public class AdderUtility {
	int add(int a, int b) {
		return a+b;
	}
	double add(double a, double b) {
		return a+b;
	}
	int add(int a, int b, int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		AdderUtility obj = new AdderUtility();
		System.out.println("Result is: "+obj.add(10,21));
		System.out.println("Result is: "+obj.add(10,21, 30));
		System.out.println("Result is: "+obj.add(10.311,21.543));
		

	}

}
