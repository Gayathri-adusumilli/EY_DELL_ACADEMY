package com.programming.class_9;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello world");
		display();
	}
	static void display()
	{
		int n=8;
		for(int i=0; i<n; i++) {
			System.out.println("Hello world!!!!!!!\n"); //O(n)
		}
		for(int i=0; i<n; i=i*2) {
			System.out.println("Hello world!!!!!!!\n"); //O(log2(n))
	}
		for(int i=0; i<n; i++) {
			System.out.println("Hello world!!!!!!!\n"); //O(log(log m)
		}
	}

}
