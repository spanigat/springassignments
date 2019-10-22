package com.shilpa;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mysql.jdbc.Connection;

public class TestMain {
	public static void main(String[] args) throws SQLException  {
		
	
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	context.scan("com.shilpa");
	context.refresh();

	DbConnection dbConnection = context.getBean(DbConnection.class);

	Connection con = dbConnection.getConnection();

	System.out.println(con.getMetaData().getDatabaseProductName());
	System.out.println(con.getMetaData().getDatabaseProductVersion());
	
	context.close();
}
}