package com.luv2code.springdemoannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.luv2code.springdemo.FortuneService;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		SwimCoach theCoach= context.getBean("swimCoachconfig",SwimCoach.class);
		/*Coach alphaCoach= context.getBean("tennisCoach",Coach.class);
		
		boolean result = (theCoach == alphaCoach);
				
		System.out.println("\n result:"+result);		
		
		System.out.println("\n Memory location:"+theCoach);
		
		System.out.println("\n Memory location:"+alphaCoach);*/
		System.out.println("Daily Fortune:"+theCoach.getDailyFortune());
		System.out.println("Daily Workout:"+theCoach.getDailyWorkout());
		
		System.out.println("Email: "+theCoach.getEmail());
		System.out.println("Email: "+theCoach.getTeam());
		//System.out.println(theCoach.getDailyWorkout());
		context.close();
	}

}
