package com.shilpa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQuestions {
public static void main(String[] args) {

	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	Questions q=(Questions)context.getBean("ques");
	
	System.out.println("Application using map in setter injecction");
	 q.displayInfo();
}
}
