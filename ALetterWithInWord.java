package com.programming.class_8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ALetterWithInWord {
	private static final String REGEX = "\\bA\\b";
	private static final String INPUT_STRING = "A A A AB A";

	public static void main(String[] args) {
		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(INPUT_STRING);
		
		int count=0;
		
		while(m.find()) {
			count++;
			System.out.println("match number" +count);
			System.out.println("starting time" +m.start());
			System.out.println("match number" +m.end());

		}
		

	}

}
