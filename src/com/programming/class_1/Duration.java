package com.programming.class_1;

public class Duration {
	long startvalue, endvalue;
	Duration(long startvalue, long endvalue){
		if(startvalue>endvalue) {
			throw new IllegalArgumentException("Start value can never be greater than end value");
		
		}
		this.startvalue = startvalue;
		this.endvalue = endvalue;
	}
	long duration() {
		return endvalue = startvalue;
	}
	public static void main(String[] args) {
		Duration obj = new Duration(19, 22);
		System.out.println("Duration is " + obj.duration());
	}
}
