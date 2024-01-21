package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_Demo1 {
	public static void main(String[] args) 
	{
		Connection conn=null;
		//step1
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step2
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/HexawareTech","root","Rupa212*");
			
			//step3
			//String insert= "insert into Employees(eid,ename,salary,job) values(112, 'Don', 70000, 'MD')";
			//String update="update employees set salary=60000 where eid=112";
			//String delete="delete from employees where eid=111 ";
			String select="select eid,ename,salary from employees";
			//step4
			Statement stmt=conn.createStatement();
			ResultSet rs= stmt.executeQuery(select);
			while(rs.next())
			{
				System.out.println(rs.getInt("eid")+" "+rs.getString("ename")+" "+rs.getInt("Salary"));
			}
		
			/*Statement stmt=conn.createStatement();
			int count=stmt.executeUpdate(delete);
			System.out.println(count+" records effected");
			*/
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				conn.close();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
