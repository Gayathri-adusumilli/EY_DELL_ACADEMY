package com.programming.class_8;

interface TestInterface{
	public void square(int a);
	default void show() {
		System.out.println("Only for one class defined method is defined" + "so that other classes don't need to implement it");
	}
}

public class DefaultKeywordFunctionality implements TestInterface{
	
	public void square(int a) {
		System.out.println(" ");
	}

	public static void main(String[] args) {

	}

}
