package com.programming.class_6;

import java.util.*;

public class UnBoundedWildCard {

	public static void main(String[] args) {
		UnBoundedWildCard obj = new UnBoundedWildCard();
		List<String> listStr = new ArrayList<>();
		listStr.add("ABC");
		listStr.add("XYZ");
		obj.printCollectionData(listStr);
		
		List<Integer> listInt = new ArrayList<>();
		listInt.add(21);
		listInt.add(22);
		obj.printCollectionData(listInt);

	}

	void printCollectionData(Collection<?> objToPrint) {
		System.out.print("[");
		for(Object obj: objToPrint) {
			System.out.print(obj.getClass().getCanonicalName() + ":" + obj);
		}
		System.out.print("]");
		System.out.println();

		
	}
}
