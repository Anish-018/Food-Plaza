package com.foodplaza.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtility 
{
	public static Connection establishConnection() throws ClassNotFoundException, SQLException
	{
		String url,user,password;
		url = "jdbc:mysql://localhost:3306/(Your Database Name which is write in mysql)";
		user = "root";
		password = "(Your Password)";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url,user,password);
		
		return conn;
	}
}