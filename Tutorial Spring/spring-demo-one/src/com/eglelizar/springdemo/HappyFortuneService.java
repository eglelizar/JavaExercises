package com.eglelizar.springdemo;

public class HappyFortuneService implements IFortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}
