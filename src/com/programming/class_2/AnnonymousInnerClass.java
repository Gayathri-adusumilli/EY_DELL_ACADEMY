package com.programming.class_2;

abstract class Sample{
	abstract void show();
}

public class AnnonymousInnerClass {

	public static void main(String[] args) {
		Sample obj = new Sample() {

			@Override
			void show() {
			System.out.println("Hello Everyone!");
				
			}
			
		};
		obj.show();

	}

}