package com.zemoso.springdemo;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;

    private String emailAddress;
    private String team;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("Cricket Coach : Inside setter method- Email Address");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("Cricket Coach : Inside setter method - Team");
        this.team = team;
    }

    public CricketCoach()
    {
        System.out.println("Cricket coach : inside no arg constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Cricket Coach : Inside setter method Fortune Service");
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Practice both bowling and batting";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
