package com.eglelizar.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.eglelizar.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig2 {
	
	@Bean
	public IFortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	@Bean
	public ICoach swimCoach() {
		SwimCoach mySwimCoach = new SwimCoach(sadFortuneService());
		return mySwimCoach;
	}

}
