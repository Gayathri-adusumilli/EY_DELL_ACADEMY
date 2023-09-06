package com.programming.class_8;

public class ArrayDefinition {

	public static void main(String[] args) {
		int[] intArr = new int[6];
		intArr[0] = 10;
		intArr[1] = 20;

		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i] + " ");
		}

		System.out.println();

		int[] intArr2 = { 30, 40 };
		for (int j : intArr2) {
			System.out.println(j + " ");

		}
	}
}
