package com.eglelizar.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements ICoach {

	private IFortuneService fortuneService;
	
	@Autowired
	public TennisCoach() {		
		//this.fortuneService = fortuneService;
	}
	
	

	@Autowired
	public void setFortuneService(IFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}




	@Override
	public String getDailyWorkout() {		
		return "Practice your backhand volley";
	}


	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
