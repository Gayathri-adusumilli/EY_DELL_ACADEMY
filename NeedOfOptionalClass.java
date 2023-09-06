package com.programming.class_8;

public class NeedOfOptionalClass {

	public static void main(String[] args) {
		String[] words = {" ", " ", " ", " ", " ", "GAYATHRI"};
		String word = "";
		if(null != words[5]) {
		word = words[5].toLowerCase();
		}
		else {
		System.out.println("at 5th index is null");
	}
		System.out.println(word);

}
}
