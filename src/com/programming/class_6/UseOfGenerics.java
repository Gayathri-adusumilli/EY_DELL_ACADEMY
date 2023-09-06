package com.programming.class_6;

class MyGeneralizedClass<T>{
	T obj;
	void add(T obj) {
		this.obj=obj;
	}
	T get() {
		return obj;
	}
}

public class UseOfGenerics {

	public static void main(String[] args) {
		MyGeneralizedClass<Integer> intType = new MyGeneralizedClass<>();
		intType.add(21);
		System.out.println(intType.get());
		intType.add(22);
		System.out.println(intType.get());
		
		MyGeneralizedClass<String> strType = new MyGeneralizedClass<>();
		strType.add("ABC");
		System.out.println(strType.get());
		
		MyGeneralizedClass<Boolean> boolType = new MyGeneralizedClass<>();
		boolType.add(true);
		System.out.println(boolType.get());

		

		
		

	}

}
