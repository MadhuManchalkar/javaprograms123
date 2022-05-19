package com.xworkz.sqlwork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.constants.ReasonFor;
import com.xworkz.constants.Type;
import com.xworkz.constants.UrlUserNamePasword;

public class TicketRunner {

	public static void main(String[] args) {
	//	here loading driver and registering driver is 
		try(Connection connection=	DriverManager.getConnection
				(UrlUserNamePasword.URL.getValue(),UrlUserNamePasword.USERNAME.getValue() ,
						UrlUserNamePasword.PASSWORD.getValue());Statement statement=connection.createStatement();)
		{
			System.out.println(connection);
String query="insert into  Ticket_details values(87,1,3,'madhu','"+Type.Balconyseats.getValue()+"','"+ReasonFor.CRICKET.getValue()+"'),(16,1,3,'megha','"+Type.Balconyseats.getValue()+"','"+ReasonFor.CRICKET.getValue()+"'),(17,1,3,'mohan','"+Type.Balconyseats.getValue()+"','"+ReasonFor.CRICKET.getValue()+"'),(18,1,3,'mahindra','"+Type.Balconyseats.getValue()+"','"+ReasonFor.CRICKET.getValue()+"')";
             
		    int  rowsAffected=statement.executeUpdate(query);
		    System.out.println(rowsAffected);
		
		}  catch (SQLException e) {
			
			e.printStackTrace();
		}
		

	}

}
