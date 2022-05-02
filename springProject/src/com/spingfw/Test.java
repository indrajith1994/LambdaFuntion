package com.spingfw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;  
  
public class Test {  
public static void main(String[] args) {  
    
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       
    student student=(student)context.getBean("studentbean");  
    student.displayInfo();  
}  
}  