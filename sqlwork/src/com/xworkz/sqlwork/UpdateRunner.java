package com.xworkz.sqlwork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.constants.ReasonFor;
import com.xworkz.constants.Type;
import com.xworkz.constants.UrlUserNamePasword;

public class UpdateRunner {

	public static void main(String[] args) {
		try(Connection connection=	DriverManager.getConnection
				(UrlUserNamePasword.URL.getValue(),UrlUserNamePasword.USERNAME.getValue() ,
						UrlUserNamePasword.PASSWORD.getValue());Statement statement=connection.createStatement();)
		{
			System.out.println(connection);
            String UpdateQuery="UPDATE  ticket_details SET personName='RAMANGOUDA' where id=87";  
            int  rowsAffected=statement.executeUpdate(UpdateQuery);
		    System.out.println(rowsAffected);
		
		}  catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
