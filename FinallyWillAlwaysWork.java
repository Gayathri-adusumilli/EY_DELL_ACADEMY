package com.programming.class_3;

public class FinallyWillAlwaysWork {

	public static void main(String[] args) {
		int result = sampleMethod();
		System.out.println("The result is:" +result);
	}
	static int sampleMethod() {
		try {
			return 123;
		} finally {
			System.out.println("The value that is being returned is 123");
		}
		
	}

}
