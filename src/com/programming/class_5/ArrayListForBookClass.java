package com.programming.class_5;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListForBookClass {

	public static void main(String[] args) {
		ArrayList<Book> arrList = new ArrayList<>();
		Book b1 = new Book(1, 10, "B", "C", "A");
		Book b2 = new Book(12, 100, "Q", "R", "P");
		Book b3 = new Book(16, 1000, "M", "N", "L");
		arrList.add(b1);
		arrList.add(b1);
		arrList.add(b1);
		arrList.add(b2);
		arrList.add(b2);
		arrList.add(b2);
		arrList.add(b3);
		arrList.add(b3);

		for (Book b : arrList) {
			System.out.println(b.bookId + " " + b.quantity + " " + b.name + " " + b.publisher + " " + b.author + " ");
		}
		Iterator<Book> itr = arrList.iterator();
		while (itr.hasNext()) {
			Book b = itr.next();
			System.out.println(b.bookId + " " + b.quantity + " " + b.name + " " + b.publisher + " " + b.author + " ");
		}

	}

}
