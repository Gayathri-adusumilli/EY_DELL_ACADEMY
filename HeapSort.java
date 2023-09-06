package com.programming.class_10;

public class HeapSort {

	public static void main(String[] args) {
		int[] intArr = { 3, 8, 1, 44, 32, 56, 49 };
		System.out.print("Before HeapSort: ");
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
		HeapSort.heapSort(intArr);
		System.out.println();
		
		System.out.print("After Heapsort: ");
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
	}
	
	static void heapSort(int[] intArr) {
		int lengthOfArray = intArr.length;
		for(int i = (lengthOfArray/2)- 1; i>=0; i--) {
			heapify(intArr, lengthOfArray, i);
			}
		for(int i = lengthOfArray-1; i>=0; i--) {
			int temp = intArr[0];
			intArr[0] = intArr[i];
			intArr[i] = temp;
			heapify(intArr, i, 0);
			
		}
			
		}
	static void heapify(int[] intArr, int lengthOfArray, int i) {
		int largest=i;
		int left = 2*i + 1;
		int right = 2*i + 2;
		 if(left < lengthOfArray && intArr[left]>intArr[largest]) {
			 largest = left;
		 }
		 
		 if(right < lengthOfArray && intArr[right]>intArr[largest]) {
			 largest = right;
		 }
		 
		 if(largest != i) {
			 int tempArr = intArr[i];
			 intArr[i] = intArr[largest];
			 intArr[largest] = tempArr;
			 
			 heapify(intArr, lengthOfArray, largest);
			 
		 }
		
	}
	}


