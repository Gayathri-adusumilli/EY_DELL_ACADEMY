package com.programming.class_5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListClass {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("A"); list.add("A"); list.add("A"); list.add("A");
		 
		//any number of null is allowed 
		list.add(null); list.add(null);list.add(null);
		
		list.add("Z"); list.add("X"); list.add("P"); list.add("B");
		
		list.addFirst("First Element");
		list.addLast("Last Element");
		
		Object firstElement = list.getFirst();
		System.out.println("First element is:" + firstElement);
		
		Object lastElement = list.getLast();
		System.out.println("Last element is:" + lastElement);
		
		int position = list.indexOf("Z");
		System.out.println("Position of Z is:" + position);
		
		int lastPositionOfA = list.lastIndexOf("A");
		System.out.println("Position of last A is:" + lastPositionOfA);
		
		list.add(0, "Added element at zeroth position");
		list.remove(2);
		
		list.removeFirst();
		list.removeLast();
		
		list.removeFirstOccurrence("A");
		list.removeLastOccurrence("A");
		
		Object o = list.poll();
		Object o2 = list.pollLast();
		
		ListIterator<String> ListItr = list.listIterator();
		while(ListItr.hasNext()) {
			System.out.println(ListItr.next() + " ");
		}
		System.out.println();
		while(ListItr.hasPrevious()) {
			System.out.println(ListItr.previous()+ " ");//ListIterator is only for linked list and only Linked list has Previous() function; for anything else one has to use next() function.
		}
	}

}
