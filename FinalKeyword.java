package com.programming.class_4;

public class FinalKeyword {
	final static String PAN_CARD_NUMBER;
	//FinalKeyword(){
		//PAN_CARD_NUMBER = "ABC5789861";}
	
	static {
		PAN_CARD_NUMBER = "ABC5789861";
	}
	final void display()
	{
		System.out.println("Final Method");
	}
	public static void main(String[] args) {
		FinalKeyword obj = new FinalKeyword();
		System.out.println("Obj is:" +obj.PAN_CARD_NUMBER);

	}

}
