package com.luv2code.springdemopractice;

public class CricketCoach implements Coach {
	
	Fortune fortune;
	
	public CricketCoach() {
		
	}
	
	public CricketCoach(Fortune fortune) {
		this.fortune= fortune;
	}

	@Override
	public String getCoachInstruction() {
		// TODO Auto-generated method stub
		return "Practice 25 times of warm up exersise today";
	}

}
