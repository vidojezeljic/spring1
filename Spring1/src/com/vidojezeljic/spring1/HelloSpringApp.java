package com.vidojezeljic.spring1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author vidojezeljic
 */
public class HelloSpringApp {

    public static void main(String[] args) {
        
        // load the spring config file
        ClassPathXmlApplicationContext contex = 
                new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // retrieve bean from spring container
        Coach coach = contex.getBean("myCoach", Coach.class);
        
        // call methods on the bean
        System.out.println(coach.getDailyWorkout());
        
        // let's call our new method for fortunes
        System.out.println(coach.getDailyFortune());
        
        // close the contex
        contex.close();
    }
}
