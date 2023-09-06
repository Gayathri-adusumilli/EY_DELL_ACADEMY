package com.programming.class_2;
interface ABC{}

class Parent implements ABC{};
class Child1 extends Parent{};
class Child2 extends Parent{};


public class InstanceOfKeyword {
	public static void main(String[] args)
	{
		Parent p = new Parent();
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		
		System.out.println(p instanceof Parent); //true
		System.out.println(p instanceof Child1); //false
		System.out.println(p instanceof Child2); //false
		
		System.out.println(c1 instanceof Parent); //true
		System.out.println(c1 instanceof Child1);//true
		
		//System.out.println(c1 instanceof Child2);//error
		
		
	}
	

}
