package com.eglelizar.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
	
	@Bean
	public IFortuneService happyFortuneService() {
		return new HappyFortuneService();
	}
	
	@Bean
	public ICoach swimCoach() {
		SwimCoach mySwimCoach = new SwimCoach(happyFortuneService());
		return mySwimCoach;
	}

}
