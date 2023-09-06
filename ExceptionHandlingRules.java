package com.programming.class_3;

import java.sql.SQLException;

class Parent{
	void show() throws SQLException{
		System.out.println("Parent class method");
	}
}

public class ExceptionHandlingRules extends Parent{
	@Override
	//void show() throws SQLException{
	void show() throws NullPointerException{
		System.out.println("Child class method");
	}

	public static void main(String[] args) {
		
	}

}
