package com.spingfw;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Print");
		 Resource resource=new ClassPathResource("applicationContext.xml");  
		 BeanFactory factory=new XmlBeanFactory(resource);  
		      
		    student student=(student)factory.getBean("studentbean");  
		    student.displayInfo();
	}

}


