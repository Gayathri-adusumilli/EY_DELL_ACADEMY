package com.programming.class_10;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] intArr = {10,32,4,5,66,7,9};
		Arrays.sort(intArr);
		System.out.println("Sorted array is: " +Arrays.toString(intArr));
		int lookOutFor = 32;
		int lastElementPositionInArray = intArr.length - 1;
		binarySearch(intArr, 0, lastElementPositionInArray, lookOutFor);
	}
	
	static void binarySearch(int[] intArr, int startingPosition, int lastPosition, int searchElement) {
		int midElementPosition = (startingPosition + lastPosition)/2;
		while(startingPosition <= lastPosition) {
			if(intArr[midElementPosition] < searchElement) {
				startingPosition = midElementPosition + 1;
			} else if(intArr[midElementPosition] == searchElement ) {
				System.out.println("Element " + searchElement + " Found in Position " + midElementPosition);
				break;
			}else {
				lastPosition = midElementPosition - 1;
			}
			midElementPosition = (startingPosition + lastPosition)/2;
		} if(startingPosition> lastPosition) {
			System.out.println("Element is not Found");	
		}
	}

}
