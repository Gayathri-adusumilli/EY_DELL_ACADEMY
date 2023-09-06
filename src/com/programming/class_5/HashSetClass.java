package com.programming.class_5;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {

	public static void main(String[] args) {
		HashSet<String> hSet = new HashSet<>();
		hSet.add("Z");
		hSet.add("Z");
		hSet.add("Z");
		hSet.add("Z");
		
		hSet.add(null);
		hSet.add(null);
		hSet.add(null);
		hSet.add(null);
		
		hSet.add("A");
		hSet.add("B");
		hSet.add("C");
		hSet.add("D");
		
		Iterator<String> itr = hSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}
	}

}
