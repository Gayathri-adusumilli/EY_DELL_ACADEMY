package com.programming.class_10;

public class SortArrayUsingBubbleSort {

	public static void main(String[] args) {
		int[] intArr = { 3, 8, 1, 44, 32, 56, 49 };
		System.out.print("Before Bubblesort: ");
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
		bubbleSort(intArr);
		System.out.println();
		
		System.out.print("After Bubblesort: ");
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
		
	}
	static void bubbleSort(int[] intArr) {
		int lengthOfArray = intArr.length;
		int tempArr = 0;
		for (int i = 0; i < lengthOfArray; i++) {
			for (int j = 1; j<(lengthOfArray-i); j++) {
				if(intArr[j-1] > intArr[j]) {
					tempArr = intArr[j-1];
					intArr[j-1] = intArr[j];
					intArr[j] = tempArr;
			}
		}
		}
		
	}
}
