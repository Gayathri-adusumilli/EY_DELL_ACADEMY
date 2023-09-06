package com.programming.class_5;

public class Booktree implements Comparable <Booktree>{
	int bookId, quantity;
	String author, publisher, name;
	

	Booktree(int bookId, int quantity, String author, String publisher, String name) {
		this.bookId = bookId;
		this.quantity = quantity;
		this.author = author;
		this.publisher = publisher;
		this.name = name;
	}
@Override
	public int compareTo(Booktree o){
	if(bookId>o.bookId) {
		return 1;
	}
	else if(bookId < o.bookId) {
		return -1;
	}
	else {
		return 0;
	}

	}

}
