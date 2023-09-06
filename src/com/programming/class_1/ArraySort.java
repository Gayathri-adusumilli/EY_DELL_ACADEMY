package com.programming.class_1;
import java.util.Arrays;
public class ArraySort {

	public static void main(String[] args) {
	int[] intArr = {2,8,3,77,1,44,223,6,31};
	Arrays.sort(intArr);
	System.out.println("The sorted array is:" +Arrays.toString(intArr));
	String[] strArr = {"A","Z","B"};
	Arrays.sort(strArr);
	System.out.println("The sorted array is:" +Arrays.toString(strArr));
	 
	}

}
