package com.programming.class_8;

import java.util.ArrayList;
import java.util.Collections;

public class UseOfStreams {

	public static void main(String[] args) {
		ArrayList<String> countries = new ArrayList<>();
		countries.add("India");
		countries.add("UK");
		countries.add("China");
		
		Collections.sort(countries);
		for(String country : countries) {
			country = country.toUpperCase();
			if(!country.startsWith("C")) {
				System.out.println("country name doesnot start with c: " +country);
			}
		}

		countries.stream().map(s-> s.toUpperCase()).filter(s->!s.startsWith("C")).sorted().forEach( s -> System.out.println(s));		

	}

}

// stream can't be modified and the stream once used cannot be reused