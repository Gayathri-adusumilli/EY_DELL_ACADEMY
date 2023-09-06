package com.programming.class_3;

import java.io.IOException;

public class ThrowKeyword {

	public static void main(String[] args) throws IOException {
		sampleMethod();
		System.out.println("Rest of code...");
		}
	static void sampleMethod() throws IOException {
		throw new IOException("Device Error");
	}
	}
//incomplete