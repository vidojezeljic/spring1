package com.vidojezeljic.spring1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author vidojezeljic
 */
public class SetterDemoApp {

    public static void main(String[] args) {
        
        // load the spring config file
        ClassPathXmlApplicationContext contex = 
                new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // retrieve bean from spring container
        CricketCoach coach = contex.getBean("myCricketCoach", CricketCoach.class);
        
        // call method on the bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        
        System.out.println(coach.getEmailAddress());
        System.out.println(coach.getTeam());
        
        // close the context
        contex.close();
    }
}
