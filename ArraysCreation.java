package com.programming.class_1;

public class ArraysCreation {

	public static void main(String[] args) {
		//declaration: instantiation
		int[] intArr = new int[3];
		
		//initialization
		intArr[0]=10;
		intArr[1]=2;
		intArr[2]=8;
		
		//initialize, declare, instantiate
		String[] strArr = {"Z","B","C"};
		
		//Traverse
		for(int i=0; i<=intArr.length - 1; i++) {
			System.out.print(intArr[i] + " ");
		}
		System.out.println();
		for(int i=0; i<strArr.length; i++) {
			System.out.print(strArr[i]+" ");
		}
		System.out.println();
		for(int i: intArr) {
			System.out.print(i + " ");
		}
	}

}
