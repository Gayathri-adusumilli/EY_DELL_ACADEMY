package com.programming.class_2;

public class PersonData implements Cloneable{
	int person_id;
	String person_name;
	
	PersonData(int person_id, String person_name){
		this.person_id = person_id;
		this.person_name = person_name;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		PersonData obj1 = new PersonData(123,"ABC");
		PersonData obj2 = (PersonData)obj1.clone();
		System.out.println("The person id is"+obj1.person_id + "and the name is" +obj1.person_name);
		System.out.println("The person id is"+obj2.person_id + "and the name is" +obj2.person_name);
		

	}

}
