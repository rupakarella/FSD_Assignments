package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil //Factory class
{
	public static Connection getDBConnection()//Factory method
	{
		Connection conn=null;
		try
		{
			//step1
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step2
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/HexawareTech","root","Rupa212*");
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return conn;
	}
}
