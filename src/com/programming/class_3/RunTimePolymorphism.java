package com.programming.class_3;

class Parent2 {
	void show() {
		System.out.println("Parent class function");
	}

	int data = 10;
}

public class RunTimePolymorphism extends Parent2 {
	void show() {
		System.out.println("Child class function");
	}

	int data = 20;

	void display() {
		this.show();
		System.out.println("The value of data is:" + this.data);
		super.show();
		System.out.println("The value of data is:" + super.data);

	}

	public static void main(String[] args) {

		Parent2 obj = new Parent2();
		obj.show();
		System.out.println("The value of data is:" + obj.data);
		RunTimePolymorphism obj2 = new RunTimePolymorphism();
		obj2.show();
		System.out.println("The value of data is:" + obj2.data);
		Parent2 obj3 = new RunTimePolymorphism();
		obj3.show();
		System.out.println("The value of data is:" + obj3.data);
		obj2.display();

	}

}
