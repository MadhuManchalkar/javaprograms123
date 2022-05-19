package com.xworkz.sqlwork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BakeryRunner {

	public static void main(String[] args) {
		String username="root";
		String password="MMMM1234";
		String url="jdbc:mysql://localhost:3306/Bakery_items";
		try(Connection connection=DriverManager.getConnection(url, username,password);Statement statement=connection.createStatement();) {
			//Class.forName("com.mysql.cj.jdbc.Driver");//load and registration
			System.out.println("class loaded");//
			
			
			//Connection connection=DriverManager.getConnection(url, username,password);
			System.out.println(connection);
			
			String insertQuery="INSERT INTO  Bakery_details VALUES(11,2,'Golden Bakery',9148302612),(21,3,'moms Bakery',9148302625),(31,7,'Cake art',9148302621),(41,5,'Cherry on top ',9148302623),(51,8,'corner bekary cafe',9148302622)";
			//Statement statement=connection.createStatement();
			int rows=statement.executeUpdate(insertQuery);
			System.out.println(rows);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
