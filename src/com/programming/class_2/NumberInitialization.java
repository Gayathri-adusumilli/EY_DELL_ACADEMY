package com.programming.class_2;

public class NumberInitialization {
int Number1;
static int Number2;

static {
	System.out.println("Static initialiazation");
	Number2 = 100;
	
}
NumberInitialization(){
	Number1 = 78;
}

	public static void main(String[] args) {
		System.out.println("the mainmethod");
		System.out.println("the value of nuber 2 is:" +Number2);
		
		NumberInitialization obj = new NumberInitialization();
		

	}

}
//Incomplete