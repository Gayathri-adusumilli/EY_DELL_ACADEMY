package com.programming.class_9;

import java.util.regex.Pattern;

public class QuantifierClassInRegex {

	public static void main(String[] args) {
		
		//a or m or n - once or not at all
		System.out.println(Pattern.matches("[amn]?", "a")); //true
		System.out.println(Pattern.matches("[amn]?", "z")); //false
		System.out.println(Pattern.matches("[amn]?", "am")); //false
		System.out.println(Pattern.matches("[amn]?", ""));//true
		
		//+ - a or m or n - once or more than once
		System.out.println(Pattern.matches("[amn]+", "aaaa"));//true
		System.out.println(Pattern.matches("[amn]+", "aaammm")); //true
		System.out.println(Pattern.matches("[amn]+", "aaammmoooo")); //false
		
		//* - a or m or n - zero or more than once
		System.out.println(Pattern.matches("[amn]*", "z"));//false
		System.out.println(Pattern.matches("[amn]*", "aaaammmm")); //true
		
		
		
		
		
	}

}
