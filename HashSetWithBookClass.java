package com.programming.class_5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetWithBookClass {

	public static void main(String[] args) {
		HashSet<Book> hSet = new HashSet<>();
		//LinkedHashSet<Book> hSet = new LinkedHashSet<>();
		Book b1 = new Book(1, 10, "B", "C", "A");
		Book b2 = new Book(12, 100, "Q", "R", "P");
		Book b3 = new Book(16, 1000, "M", "N", "L");
		hSet.add(b1);
		hSet.add(b1);
		hSet.add(b1);
		hSet.add(b2);
		hSet.add(b2);
		hSet.add(b2);
		hSet.add(b3);
		hSet.add(b3);

		for (Book b : hSet) {
			System.out.println(b.bookId + " " + b.quantity + " " + b.name + " " + b.publisher + " " + b.author + " ");
		}
		Iterator<Book> itr = hSet.iterator();
		while (itr.hasNext()) {
			Book b = itr.next();
			//System.out.println(b.bookId + " " + b.quantity + " " + b.name + " " + b.publisher + " " + b.author + " ");
		}

	}

}
