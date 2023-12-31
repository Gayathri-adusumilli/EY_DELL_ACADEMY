package com.programming.class_9;

import java.util.regex.Pattern;

public class UserNameValidation {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "abcd34")); // true
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "abcd347")); // false

		// mobile number validation
		System.out.println(Pattern.matches("[6789]{1}[0-9]{9}", "9898989898"));

		// trim function is only used to remove leading and trailing
		// white spaces in string whereas with replace, you can remove white spaces from
		// with in

		String str = "    Java Example Trim     Function    ";
		System.out.println(str.trim());

	}

}
