package com.shilpa;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shilpa.service.Myservice;

public class MainTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

		ctx.getBean("myAwareService", Myservice.class);
		
		ctx.close();
	}
}
