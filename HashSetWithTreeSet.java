package com.programming.class_5;

import java.util.Iterator;
import java.util.TreeSet;

public class HashSetWithTreeSet {

	public static void main(String[] args) {
		TreeSet<Booktree> hSet = new TreeSet<>();
		Booktree b1 = new Booktree(1, 10, "B", "C", "A");
		Booktree b2 = new Booktree(12, 100, "Q", "R", "P");
		Booktree b3 = new Booktree(16, 1000, "M", "N", "L");
		hSet.add(b1);
		hSet.add(b1);
		hSet.add(b1);
		hSet.add(b2);
		hSet.add(b2);
		hSet.add(b2);
		hSet.add(b3);
		hSet.add(b3);

		for (Booktree b : hSet) {
			System.out.println(b.bookId + " " + b.quantity + " " + b.name + " " + b.publisher + " " + b.author + " ");
		}
		Iterator<Booktree> itr = hSet.iterator();
		while (itr.hasNext()) {
			Booktree b = itr.next();
			//System.out.println(b.bookId + " " + b.quantity + " " + b.name + " " + b.publisher + " " + b.author + " ");
		}

	}

}


