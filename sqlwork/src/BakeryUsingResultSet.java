import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.constants.UrlUserNamePasword;

public class BakeryUsingResultSet {
       
	public static void main(String[] args) {
		String query="select * from bakery_details";
		try(Connection connection=DriverManager.getConnection(UrlUserNamePasword.URL.getValue(),UrlUserNamePasword.USERNAME.getValue(),UrlUserNamePasword.PASSWORD.getValue());
				Statement statement=connection.createStatement();	)
		{
			ResultSet  resultset= statement.executeQuery(query);
			while(resultset.next())
			{
				int id=resultset.getInt("id");
				int no_of_employes=resultset.getInt("no_of_employess");
				String name=resultset.getString("bakery_name");
				Long mobile=resultset.getLong("mobile_no");
				System.out.println(String.format("%s %s %s %s", id,no_of_employes,name,mobile));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
