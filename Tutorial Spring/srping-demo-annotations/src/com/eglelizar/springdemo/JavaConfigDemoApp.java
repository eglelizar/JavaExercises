package com.eglelizar.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		ICoach theCoach = context.getBean("tennisCoach", ICoach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());		
		
		SwimCoach newCoach = context.getBean("swimCoach", SwimCoach.class);
		System.out.println(newCoach.getEmail());
		System.out.println(newCoach.getTeam());
		
		context.close();
	}

}
