package com.programming.class_8;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.*;

public class ArrayDefinition1 {

	public static void main(String[] args) {
		Integer[] intArr = new Integer[2];
		intArr[0]=10;
		intArr[1]=20;
		
		ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(intArr));
		
		Iterator<Integer> itr = arrList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next() +" ");
		}

		
	}

}
