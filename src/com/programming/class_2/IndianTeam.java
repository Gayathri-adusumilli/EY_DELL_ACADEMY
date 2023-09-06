package com.programming.class_2;

public class IndianTeam implements ISports {


	@Override
	public void SetVenue(String place) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SetVisitingteam(String place) {
		System.out.println("Visiting team is:" +place);		
	}

	@Override
	public void SetHometeam(String place) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		IndianTeam Obj = new IndianTeam();
		Obj.SetVisitingteam("Australia");

	}
	

}
