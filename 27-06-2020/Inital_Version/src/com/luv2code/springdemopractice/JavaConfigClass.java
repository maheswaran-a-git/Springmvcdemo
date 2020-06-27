package com.luv2code.springdemopractice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigClass {

	@Bean
	public FortuneService getFortune() {
		return new FortuneService();
	}
	
	@Bean
	public CricketCoach cricketCoachInstruction() {
		return new CricketCoach(getFortune());
	}
}
