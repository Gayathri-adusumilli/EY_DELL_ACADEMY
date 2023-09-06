package com.programming.class_6;

interface isFunctional{
	void show(String data);
}

public class LambdaExpressionSecondExample {

	public static void main(String[] args) {
		isFunctional obj = new isFunctional() {
			public void show(String data) {
			System.out.println("Using Anonymous Inner" + data);
			}

	};
	
	obj.show("Class way of implementation");
	
	isFunctional obj2 = (demoData) -> {
		System.out.println("Eliminating anonymous Inner " + demoData);
	};
	obj2.show("Using class way of implementation - through lambda expression");

}
}
