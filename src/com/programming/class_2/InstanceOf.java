package com.programming.class_2;

public class InstanceOf {

	public static void main(String[] args) {
		InstanceOf obj = new InstanceOf();
		System.out.println(obj instanceof InstanceOf ); //true
		obj = null;
		System.out.println(obj instanceof InstanceOf ); //false
	}

}
