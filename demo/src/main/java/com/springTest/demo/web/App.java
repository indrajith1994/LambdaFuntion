package com.springTest.demo.web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
    	
    	vehicle obj = (vehicle)context.getBean("vehicle");
    	obj.drive();
    	
    	car c = new car();
    	c.drive();
    	
    	bike b = new bike();
    	b.drive();
    	
    	vehicle v = new car();
    	v.drive();
    }
}
