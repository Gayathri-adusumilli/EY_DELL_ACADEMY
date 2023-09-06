package com.programming.class_3;

public class TryWithResourceWithAutoCloseable {

	public static void main(String[] args) {
		try {
			tryWithResource();
		} catch (Exception e) {
			System.out.println("The exception thrown is:" +e.getMessage());
		}
		try {
			tryWithOutResource();
		} catch (Exception e) {
			System.out.println("The exception thrown is:" +e.getMessage());
		}
	}

	static void  tryWithResource() throws Exception {
		try(MyResource mr = new MyResource()){
			System.out.println("I am in try with resource method");
			if(true) {
				throw new Exception("Exception thrown from try with source");
			}
		} 
		
	}

	static void tryWithOutResource() throws Exception {
	MyResource mr = null;
		try{
			mr = new MyResource();
			System.out.println("I am in try without resource method");
			if(true) {
				throw new Exception("Exception thrown from try without resource");
			}
		}finally {
			if(mr!=null)
			{
				mr.close();
			}
	}
}

static class MyResource implements AutoCloseable {
	public void close() throws Exception{
		System.out.println("close will be called immediately for all close up activities");
	}
}}
