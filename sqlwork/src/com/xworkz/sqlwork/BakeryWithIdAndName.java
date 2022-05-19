package com.xworkz.sqlwork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.constants.UrlUserNamePasword;

public class BakeryWithIdAndName {

	public static void main(String[] args) {
	String query="select bakery_name from bakery_details where bakery_name Like 'm%' ";
	
		try(Connection connection=DriverManager.getConnection(UrlUserNamePasword.URL.getValue(),UrlUserNamePasword.USERNAME.getValue(),UrlUserNamePasword.PASSWORD.getValue());
				Statement statement=connection.createStatement();	)
		{
			ResultSet  resultset= statement.executeQuery(query);
			while(resultset.next())
			{
				//System.out.println("row exit");
			  //   int id=resultset.getInt("id");
				String name=resultset.getString("bakery_name");
				System.out.println(name);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	}


