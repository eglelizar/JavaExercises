package com.eglelizar.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ICoach theCoach = context.getBean("tennisCoach", ICoach.class);
		ICoach alphaCoach = context.getBean("tennisCoach", ICoach.class);
		boolean result = (theCoach == alphaCoach);
		System.out.println(result);
		context.close();
	}

}
