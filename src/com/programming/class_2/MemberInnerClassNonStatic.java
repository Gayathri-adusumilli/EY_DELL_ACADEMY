package com.programming.class_2;

public class MemberInnerClassNonStatic {
	private int data = 10;
	class ABC{
		void show() {
			System.out.println("The Value of the data is:" +data);
		}
		
	}

	public static void main(String[] args) {
		MemberInnerClassNonStatic obj = new MemberInnerClassNonStatic();
		MemberInnerClassNonStatic.ABC obj1 = obj.new ABC();
		obj1.show();
	}

}
