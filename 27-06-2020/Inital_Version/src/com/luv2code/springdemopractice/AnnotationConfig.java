package com.luv2code.springdemopractice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext annotation = 
				new AnnotationConfigApplicationContext(JavaConfigClass.class);
		Coach theCoach = annotation.getBean("cricketCoachInstruction",Coach.class);
		System.out.println("Cricket Coach:"+theCoach.getCoachInstruction());
		
	}

}
