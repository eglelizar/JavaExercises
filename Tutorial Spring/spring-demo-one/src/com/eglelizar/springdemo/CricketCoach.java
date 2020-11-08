package com.eglelizar.springdemo;

public class CricketCoach implements ICoach {
	private IFortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	private CricketCoach() {
		System.out.println("Cricket Coach: inside no-arg constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return "Yeah...: " + fortuneService.getFortune();
	}

	public IFortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(IFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
	
	

}
