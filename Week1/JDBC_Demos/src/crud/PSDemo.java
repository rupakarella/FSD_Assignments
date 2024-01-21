package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PSDemo {
	public static void main(String[] args) 
	{
		Connection conn= DBUtil.getDBConnection();
		/*String insert="insert into dept values(?,?,?)";
		try
		{
			PreparedStatement pstmt=conn.prepareStatement(insert);
			pstmt.setInt(1,80);
			pstmt.setString(2, "Logistics");
			pstmt.setString(3,"Noida");
			int count=pstmt.executeUpdate();
			System.out.println(count);
		
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		 */
		/*String update="update dept set dname=?, location=? where dno=?";
		try
		{
			PreparedStatement pstmt=conn.prepareStatement(update);
			pstmt.setString(1, "Tours&Travels");
			pstmt.setString(2,"Greater Noida");
			pstmt.setInt(3,80);
			int count=pstmt.executeUpdate();
			System.out.println("record updated is "+count);
		
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		*/
		
		/*
		 String selectById="select dno,dname,location from dept where dno>?";
		
		try
		{
			PreparedStatement pstmt=conn.prepareStatement(selectById);
			pstmt.setInt(1,50);
			ResultSet rs= pstmt.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt("dno")+" "+rs.getString("dname")+" "+rs.getString("location"));
			}
		
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		 */
		/*
		String delete="delete from dept where dno=?";
		try
		{
			PreparedStatement pstmt=conn.prepareStatement(delete);
			pstmt.setInt(1,80);
			int count=pstmt.executeUpdate();
			System.out.println(count+" record deleted");
		
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		*/
		String selectAll="select dno, dname, location from dept";
		try
		{
			PreparedStatement pstmt=conn.prepareStatement(selectAll);
			ResultSet rs= pstmt.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt("dno")+" "+rs.getString("dname")+" "+rs.getString("location"));
			}
	
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

}}
