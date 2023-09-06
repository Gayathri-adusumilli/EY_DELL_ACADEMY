package com.programming.class_1;

public class MinimumValueArray {

	public static void main(String[] args) {
		int intArr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		min(intArr);
	}
	static void min(int[] intArr) {
		int min = intArr[0];
		for(int i=0; i<intArr.length;i++)
		{
			if(min>intArr[i]) {
				min=intArr[i];
			}
		}
		System.out.println("The minimum value of the array is " +min);
	}

}
