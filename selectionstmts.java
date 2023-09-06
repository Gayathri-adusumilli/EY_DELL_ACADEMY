package com.programming.class_1;

public class selectionstmts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		grading('A');
		grading('B');
		grading('C');
		grading('D');
	}
	static void grading(char grade) {
	int success;
	switch(grade)
	{
	case 'A':
		success = 1;
		System.out.println("Excellent");
		break;
	
	case 'B':
		success=0;
		System.out.println("Good");
		break;

	case 'C':
		success=-1;
		System.out.println("okay");
		break;
	
		default:
			success=-2;
			System.out.println("fail");
			break;
	}
			
}
}

	
