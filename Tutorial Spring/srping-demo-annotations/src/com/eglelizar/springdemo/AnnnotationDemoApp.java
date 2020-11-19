package com.eglelizar.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(SportConfig.class);
		ICoach theCoach = context.getBean("tennisCoach", ICoach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());		
		
		//swimCoach newCoach = context.getBean("swimCoach", swimCoach.class);
		//System.out.println(newCoach.getEmail());
		//System.out.println(newCoach.getTeam());
		
		context.close();
	}

}
