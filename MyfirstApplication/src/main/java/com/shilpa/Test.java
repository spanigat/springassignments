package com.shilpa;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextConstrictore.xml");
	Customer customer = (Customer) context.getBean("customer");
	 
    System.out.println("Spring Application Demo using ApplicationContext\n");

    customer.printCustomerDetail();

}
}
