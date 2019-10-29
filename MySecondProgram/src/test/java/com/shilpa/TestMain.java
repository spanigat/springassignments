package com.shilpa;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMain {

	
	
	@Before
	public void setUpMethod(){
		Questions q=new Questions();
	}
	 @Test
	 public void displyInfo(){
		 assertEquals("my name is shilpa", "my name is shilpa");
	 }
	 @After
		public void tearDownMethod(){
		 System.out.println("it ll run after each test case");
	 }
}
