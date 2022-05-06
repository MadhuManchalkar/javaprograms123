package com.xworkz.sqlwork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BakeryRunner {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class loaded");
			
			String username="root";
			String password="mummypappa";
			String url="jdbc:mysql://localhost:3306/Bakery_items";
			Connection connection=DriverManager.getConnection(url, username, password);
			System.out.println(connection);
			
			String insertQuery="INSERT INTO  Bakery_details VALUES(1,2,'Golden Bakery',9148302612),(2,3,'moms Bakery',9148302625),(3,7,'Cake art',9148302621),(4,5,'Cherry on top ',9148302623),(5,8,'corner bekary cafe',9148302622)";
			Statement statement=connection.createStatement();
			int rows=statement.executeUpdate(insertQuery);
			System.out.println(rows);
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
