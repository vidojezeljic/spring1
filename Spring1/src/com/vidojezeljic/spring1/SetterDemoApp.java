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
        Coach coach = contex.getBean("myCricketCoach", Coach.class);
        
        // call method on the bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        
        // close the context
        contex.close();
    }
}
