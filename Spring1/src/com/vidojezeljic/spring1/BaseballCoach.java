package com.vidojezeljic.spring1;

/**
 *
 * @author vidojezeljic
 */
public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting pracitce!";
    }

}
