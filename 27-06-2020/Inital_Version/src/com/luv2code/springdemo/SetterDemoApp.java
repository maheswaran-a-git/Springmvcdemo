package com.luv2code.springdemo;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SetterDemoApp {
	
	public static void main(String args[]) {
		
		FileSystemXmlApplicationContext context = 
				new FileSystemXmlApplicationContext("applicationContext.xml");
		
		CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getTeam());
		
		System.out.println(theCoach.getEmailAddress());
		
		context.close();
	}

}
