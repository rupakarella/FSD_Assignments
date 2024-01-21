package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Department;

public class DeptDaoImp implements IDeptDao
{
	Connection conn=null;
	public DeptDaoImp()
	{
		conn= DBUtil.getDBConnection();
	}
	@Override
	public int insertDept(Department dept) {
		// TODO Auto-generated method stub
		String insert="insert into dept values(?,?,?)";
		int count=0;
		try
		{
			PreparedStatement pstmt=conn.prepareStatement(insert);
			pstmt.setInt(1,dept.getDno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3,dept.getLocation());
			count=pstmt.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public int updateDept(Department dept) {
		// TODO Auto-generated method stub
		String update="update dept set dname=?, location=? where dno=?";
		int count=0;
		try
		{
			PreparedStatement pstmt=conn.prepareStatement(update);
			pstmt.setInt(3,dept.getDno());
			pstmt.setString(1, dept.getDname());
			pstmt.setString(2,dept.getLocation());
			count=pstmt.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public int deleteOne(int dno) {
		// TODO Auto-generated method stub
		String delete="delete from dept where dno=?";
		int count=0;
		try
		{
			PreparedStatement pstmt=conn.prepareStatement(delete);
			pstmt.setInt(1,dno);
			count=pstmt.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public Department selectOne(int dno) {
		// TODO Auto-generated method stub
		String selectOne="select dno,dname,location from dept where dno=?";
		Department dept1=null;
		try
		{
			PreparedStatement pstmt=conn.prepareStatement(selectOne);
			pstmt.setInt(1,dno);
			ResultSet rs= pstmt.executeQuery();
			while(rs.next())
			{
				dept1= new Department(rs.getInt("dno"),rs.getString("dname"), rs.getString("location"));
			}
		
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return dept1;
	}

	@Override
	public List<Department> selectAll() {
		// TODO Auto-generated method stub
		String selectAll="select dno, dname, location from dept";
		List<Department> list= new ArrayList<Department>();
		try
		{
			PreparedStatement pstmt=conn.prepareStatement(selectAll);
			ResultSet rs= pstmt.executeQuery();
			while(rs.next())
			{	
				Department dept= new Department(rs.getInt("dno"),rs.getString("dname"), rs.getString("location"));
				list.add(dept);
			}
	
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return list;
	}
	
}
