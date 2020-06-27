package com.luv2code.springdemoannotation;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext context = 
				new FileSystemXmlApplicationContext("applicationContext_annotationpackage.xml");
		Coach theCoach= context.getBean("tennisCoach",Coach.class);
		Coach alphaCoach= context.getBean("tennisCoach",Coach.class);
		
		boolean result = (theCoach == alphaCoach);
				
		System.out.println("\n result:"+result);		
		
		System.out.println("\n Memory location:"+theCoach);
		
		System.out.println("\n Memory location:"+alphaCoach);
		//System.out.println(theCoach.getDailyWorkout());
		
		context.close();
	}

}
