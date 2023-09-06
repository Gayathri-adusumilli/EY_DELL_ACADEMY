package com.programming.class_5;

import java.util.*;

public class HowArrayListWorks {

	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<>();
		arrList.add("A");
		arrList.add("A");
		arrList.add("A");
		arrList.add("A");

		arrList.add(null);
		arrList.add(null);
		arrList.add(null);

		arrList.add("Z");
		arrList.add("X");
		arrList.add("Y");
		arrList.add("B");
		
		Iterator<String> itr = arrList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next() + " ");
			
			//Second array
			System.out.println("The second array list is:");
			ArrayList<String> arrList2 = new ArrayList<>();
			arrList2.add("P");
			arrList2.add("P");
			arrList2.add("Q");
			arrList.addAll(arrList2);
			System.out.println("Size of my array list is:" +arrList.size());
			
			System.out.println("Removing the list");
			arrList.remove("A");
			arrList.removeAll(arrList2);
			arrList.set(1,  "New second element");
			
			System.out.println("Retaining the list");
			arrList.retainAll(arrList2);
			
			Iterator<String> itr = arrList.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next() + " ");
				arrList.retainAll(arrList2);
			}
			arrList.clear();
			for(String str: arrList) {
				System.out.println(str+ " ");
			}
			
				
				
				
			
			
		}

	}

}
