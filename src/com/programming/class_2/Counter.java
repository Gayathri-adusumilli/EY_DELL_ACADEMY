package com.programming.class_2;

public class Counter {

	// static int count;
	int count;

	Counter() {
		count++;
		System.out.println("The count is" + count);
	}

	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();

		Counter c3 = new Counter();

	}

}
