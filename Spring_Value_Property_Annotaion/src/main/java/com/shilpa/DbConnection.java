package com.shilpa;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class DbConnection {
	private String driverClass;
	private String dbURL;
	private String userName;
	private char[] password;
	private Connection con;

	public DbConnection(String driverClass, String dbURL, String userName, char[] password) {
		this.driverClass = driverClass;
		this.dbURL = dbURL;
		this.userName = userName;
		this.password = password;
	}

	public Connection getConnection() {
		if (this.con != null)
			return con;

		Connection con = null;
		try {
			System.out.println("Creating DB Connection");
			Class.forName(driverClass);
			con = (Connection) DriverManager.getConnection(dbURL, userName, String.valueOf(password));
			System.out.println("Successfully Created DB Connection");
			System.out.println(" Username is "+userName);
			System.out.println("Password is" +password);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		this.con = con;
		return con;
	}

	public void close() {
		System.out.println("DBConnection close called");
		if (this.con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
