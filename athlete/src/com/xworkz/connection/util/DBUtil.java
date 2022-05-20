package com.xworkz.connection.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.xworkz.constants.Myproperites.*;

public class DBUtil {
	public static Connection getConnection() throws SQLException
	{
		return DriverManager.getConnection(URL.getValues(), USERNAME.getValues(), PASSWORD.getValues());
	}

}
