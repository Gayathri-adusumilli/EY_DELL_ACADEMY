package com.programming.class_5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListForBook {

	public static void main(String[] args) {
		LinkedList<Book> list = new LinkedList<>();
		Book b1 = new Book(1, 10, "B", "C", "A");
		Book b2 = new Book(12, 100, "Q", "R", "P");
		Book b3 = new Book(16, 1000, "M", "N", "L");
		list.add(b1);
		list.add(b1);
		list.add(b1);
		list.add(b2);
		list.add(b2);
		list.add(b2);
		list.add(b3);
		list.add(b3);

		for (Book b : list) {
			System.out.println(b.bookId + " " + b.quantity + " " + b.name + " " + b.publisher + " " + b.author + " ");
		}
		ListIterator<Book> ListItr = list.listIterator();
		while (ListItr.hasNext()) {
			Book b = ListItr.next();
			System.out.println(b.bookId + " " + b.quantity + " " + b.name + " " + b.publisher + " " + b.author + " ");
		}

	}

}
