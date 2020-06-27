package com.luv2code.springdemoannotation;

import com.luv2code.springdemo.FortuneService;

class SadFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Sad fortune Service";
	}

}
