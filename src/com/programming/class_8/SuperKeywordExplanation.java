package com.programming.class_8;

class Parent{
	void show() {
		System.out.println("Parent class function - show");
	}
	int data=10;
}

public class SuperKeywordExplanation extends Parent {
	
	@Override
	void show() {
		System.out.println("Child class function - show");
	}
int data=20;
void display() {
	System.out.println("The value of current class is" +this.data);
	System.out.println("The value of super class is" +super.data);
	this.show();
	super.show();
	
}
	public static void main(String[] args) {
		SuperKeywordExplanation obj = new SuperKeywordExplanation();
		obj.display();
	}

}
