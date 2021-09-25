package com.zemoso.springdemo;

public class BaseballCoach implements Coach{
	private FortuneService fortuneService;
	BaseballCoach(FortuneService fortuneService)
	{
		this.fortuneService=fortuneService;
	}
	@Override
	public String getDailyWorkout()
	{
		return "spend 30 mins on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
