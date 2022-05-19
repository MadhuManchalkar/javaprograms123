package com.xworkz.sqlwork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Practice {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		   System.out.println("class loaded");
		   
		Connection connection=DriverManager.getConnection(null, null, null);//foce us to handle the it means it is checked exception
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
