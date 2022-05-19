package com.xworkz.sqlwork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.constants.UrlUserNamePasword;

public class DeleteRunner {

	public static void main(String[] args) {
		try(Connection connection=	DriverManager.getConnection
				(UrlUserNamePasword.URL.getValue(),UrlUserNamePasword.USERNAME.getValue() ,
						UrlUserNamePasword.PASSWORD.getValue());Statement statement=connection.createStatement();)
		{
			System.out.println(connection);
            String deleteQuery="DELETE  FROM ticket_details WHERE ID=1";  
            int  rowsAffected=statement.executeUpdate(deleteQuery);
		    System.out.println(rowsAffected);
		
		}  catch (SQLException e) {
			
			e.printStackTrace();
		}
		

	}

}
