package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class First {

	public static void main(String[] args) {

		//jdbc 5 steps
		
		//load driver
		
		try {
			
			Class.forName("org.postgresql.Driver");
			
			//create connection server and java
			//location-url
			//username
			//password
			//protocol://server:port/endpoint
			//jdbc:databasename://localhost:5432/dbname
			String url="jdbc:postgresql://localhost:5432/first";
			String user="postgres";//root
			String password="root";
					
			Connection connection = DriverManager.getConnection(url,user,password);
			
			System.out.println(connection);
			
			//creating statement 
		Statement statement=connection.createStatement();
		
		//execute statement and processresult
		
		 statement.execute("create tables second (a numeric primary key ,b varchar);");
		
		//close connection
		connection.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}
