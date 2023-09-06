package com.programming.class_5;

import java.util.HashMap;
import java.util.Map;


public class HashMapForCustomClass {

	public static void main(String[] args) {
		HashMap<Integer, Book> hMap = new HashMap<>();
		
		Book b1 = new Book(1, 10, "B", "C", "A");
		Book b2 = new Book(12, 100, "Q", "R", "P");
		Book b3 = new Book(16, 1000, "M", "N", "L");
		
		hMap.put(123,  b3);
		hMap.put(135,  b2);
		hMap.put(121,  b3);

		for(Map.Entry<Integer, Book> m: hMap.entrySet()) {
			int key = m.getKey();
			Book b = m.getValue();
			System.out.println("The key" + key + "details are:");
			System.out.println(b.bookId + " " + b.quantity + " " + b.name + " " + b.publisher + " " + b.author + " ");

			
		}
		

	}

}
