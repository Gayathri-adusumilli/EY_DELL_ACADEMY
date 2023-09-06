package com.programming.class_2;

public class LocalInnerClass {
	private int data = 20;
	void local() {
	class ABC{
		void show() {
			System.out.println("The Value of the data is:" +data);
		}
		
	}
	ABC obj = new ABC();
	obj.show();
	}


	public static void main(String[] args) {
		LocalInnerClass obj1 = new LocalInnerClass();
		obj1.local();
		
	}

}
