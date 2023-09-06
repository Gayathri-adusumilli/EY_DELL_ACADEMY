package com.programming.class_2;

public class EmployeeData {
	int empId;
	String empName;
	static String orgAddress = "ABC DEF";
	static void orgAddresschange(){
		orgAddress="MNO PQR";
	}
	EmployeeData(int empId, String empName){
		this.empId = empId;
		this.empName = empName;
	}
	void display() {
		System.out.println("");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//incomplete