package com.programming.class_2;

@FunctionalInterface
interface SampleDat {
	void fullName(String firstname, String lastname);
}

public class SampleData implements SampleDat{

	@Override
	public void fullName(String firstname, String lastname) {
		System.out.println("Name is: "+firstname+" "+lastname);
		
	}
	public static void main(String[] args) {
		SampleData obj = new SampleData();
		obj.fullName("Gayathri", "Adusumilli");
	}
	
}
