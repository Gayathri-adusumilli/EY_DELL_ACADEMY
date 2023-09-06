package com.programming.class_3;

public class UncheckedException {
	public static void main(String[] args) {
		// int data = 10 / 0;
		// System.out.println("The value is:" + data); // Arithmetic Exception
		UncheckedException obj = new UncheckedException();
		obj = null;
		obj.abc();// null pointer exception
	}

	void abc() {
		System.out.println("Hi");
	}

}
