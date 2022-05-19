package com.xworkz.sqlwork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class YoutubePractice {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class loaded");
			String url="jdbc:mysql://localhost:3306/Raamu";
			String username="root";
			String password="MMMM1234";
			Connection connection=DriverManager.getConnection(url, username, password);
			System.out.println(connection);
			
			String createtable="create table Student(id int,name text,city text)";
			Statement statement=connection.createStatement();
			int noOfrowsAffectec=statement.executeUpdate(createtable);
			System.out.println(noOfrowsAffectec);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
