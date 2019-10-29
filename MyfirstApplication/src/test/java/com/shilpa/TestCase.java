package com.shilpa;

import org.junit.Before;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.After;
public class TestCase {

	Customer customer;
	
	@Before
	public void setUpMethod(){
		customer =new Customer();
	}
	
	 @Test
	public void getCustomerName(){
		 	
	      String cu = customer.getCustomerName();
	      assertEquals(cu, null);
	}
	 
	 @Test
	 public void printCustomerDetail(){
		 assertEquals("shilpa", "shilpa");
	 }
	 
	
	 
}
