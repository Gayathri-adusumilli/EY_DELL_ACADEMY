package com.programming.class_1;
import java.util.*;

public class CopyArray {

	public static void main(String[] args) {
		char[] chArr1 = {'z', 'a', 'b', 'c', 'w'};
		char[] ch2 = new char[3];
		
		System.arraycopy(chArr1, 2, ch2, 0, 3);
		System.out.println(Arrays.toString(ch2));
		System.out.println(new String(ch2));
		

	}

}
