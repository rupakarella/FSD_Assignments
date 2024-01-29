package com.hexaware.userspringjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hexaware.userspringjdbc.model.Users;

public class UserMapper implements RowMapper<Users> {

	@Override
	public Users mapRow(ResultSet rs, int rowNum) throws SQLException{
		Users user=new Users();
		user.setUserId(rs.getInt("userId"));
		user.setName(rs.getString("name"));
		user.setAge(rs.getInt("age"));
		user.setSalary(rs.getInt("salary"));
		return user;
	}

}
