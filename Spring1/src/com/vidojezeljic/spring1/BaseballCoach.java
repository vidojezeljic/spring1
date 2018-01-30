package com.vidojezeljic.spring1;

/**
 *
 * @author vidojezeljic
 */
public class BaseballCoach implements Coach {
    
    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting pracitce!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    
}
