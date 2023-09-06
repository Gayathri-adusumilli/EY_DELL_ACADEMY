package com.programming.class_3;

class InvalidAgeException extends Exception{
	InvalidAgeException(String message){
		super(message);
	}
}
public class LetsCreateCustomException {

	public static void main(String[] args) {
		try {
			validVoterStatus(17);
		} catch (InvalidAgeException e) {
			System.out.println("The exception is:"+e.getMessage());
		}
		System.out.println("The code will run smoothly now...");
	}
	static void validVoterStatus(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("user cannot vote!");
		}
	}

}
