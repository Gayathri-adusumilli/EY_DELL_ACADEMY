package com.programming.class_9;

import java.util.regex.Pattern;

public class CharacterClassInRegex {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[amn]", "a"));//true
		System.out.println(Pattern.matches("[amn]", "aa"));//false

        System.out.println(Pattern.matches("[amn]", "m"));//true

        System.out.println(Pattern.matches("[amn]", "mn"));//false

        System.out.println(Pattern.matches("[^amn]", "z"));//true because ^sign checks anything except the given string

        //any character except a or m or n

        System.out.println(Pattern.matches("[^amn]", "z"));//true

        //any alphabet lower case or upper case

        System.out.println(Pattern.matches("[a-zA-Z]", "B"));//true

        //a through d or m through p

        System.out.println(Pattern.matches("[a-d[m-p]]","e"));//false

	}

}
