package com.programming.class_10;

public class SwapElements {

	public static void main(String[] args) {
		int[] intArr = {21,1,33,4,66,7,88,9};
		System.out.print("Elements before swapping");
		for(int i: intArr) {
			System.out.print(i +" ");
		}
		System.out.println();
		int firstIndex = 1, secondIndex=4;
		
		int temp =  intArr[firstIndex];
		intArr[firstIndex] = intArr[secondIndex];
		intArr[secondIndex] = temp;
		
		System.out.print("Elements after swapping");
		for(int i: intArr) {
			System.out.print(i +" ");

		}



	}

}
