package com.eglelizar.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		ICoach theCoach = context.getBean("myCoach", ICoach.class);
		System.out.println(theCoach.getDailyWorkout());				
		context.close();
	}

}
