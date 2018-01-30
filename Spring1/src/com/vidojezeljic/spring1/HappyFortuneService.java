package com.vidojezeljic.spring1;

/**
 *
 * @author vidojezeljic
 */
public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
    
}
