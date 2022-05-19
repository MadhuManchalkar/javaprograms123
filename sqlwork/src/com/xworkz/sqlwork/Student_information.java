package com.xworkz.sqlwork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Student_information {

	public static void main(String[] args) {
		
		String username="root";
		String password="MMMM1234";
		String url="jdbc:mysql://localhost:3306/high_school_student";
		try(Connection connection=	DriverManager.getConnection(url, username, password);Statement statement=connection.createStatement();) {
		//Connection connection=	DriverManager.getConnection(url, username, password);
		System.out.println(connection);
		System.out.println();
	//	Statement statement=connection.createStatement();
		for(int i=0;i<args.length;i++)
		{
		String inserQuery="insert into i123 values(1,1,1,"+args[i++]+","+args[i++]+","+args[i++]+","+args[i++]+")";
		
		int rowsAffected=statement.executeUpdate(inserQuery);
		
			System.out.println(rowsAffected);
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
