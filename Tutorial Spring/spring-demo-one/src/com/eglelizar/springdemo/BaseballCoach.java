package com.eglelizar.springdemo;

public class BaseballCoach implements ICoach {
	private IFortuneService fortuneService;
	
	public BaseballCoach(IFortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
