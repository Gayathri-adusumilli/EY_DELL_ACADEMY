package com.programming.class_8;

import java.util.*;
import java.lang.*;

public class replace {

	public static void main(String[] args) {
		String[] strInput = {"Gayathri"};
		String replacedStr = " " ;
		if(strInput != null) {
			replacedStr = strInput[0].replace("a", "W");
		}
		else {
			System.out.println("null");
		}
		System.out.println("the string is:" + replacedStr);
	}

}
