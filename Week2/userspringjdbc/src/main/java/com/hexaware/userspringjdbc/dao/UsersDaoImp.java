package com.hexaware.userspringjdbc.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hexaware.userspringjdbc.model.Users;
@Repository
public class UsersDaoImp implements IUsersDao {
	JdbcTemplate jdbcTemplate;
	@Autowired
	public UsersDaoImp(DataSource datasource)
	{
		jdbcTemplate=new JdbcTemplate(datasource);
	}
	@Override
	public boolean createUser(Users user) {
		String insertQuery="insert into users(userId, name, age, salary)values(?,?,?,?)";
		int count=jdbcTemplate.update(insertQuery,user.getUserId(),user.getName(),user.getAge(),user.getSalary());
		return count>0;
	}

	@Override
	public boolean updateUser(Users user) {
		String updateQuery="update users set name=?,age=?,salary=? where userId=?";
		int count =jdbcTemplate.update(updateQuery,user.getName(),user.getAge(),user.getSalary(),user.getUserId());
		return count>0;
	}

	@Override
	public boolean deleteUserById(int userId) {
		String deleteQuery="delete from users where userId=?";
		int count=jdbcTemplate.update(deleteQuery,userId);
		return count>0;
	}

	@Override
	public Users selectUserById(int userId) {
		String selectById="select userId, name, age, salary from users where userId=?";
		Users user=jdbcTemplate.queryForObject(selectById, new UserMapper(),userId);
		return user;
	}

	@Override
	public List<Users> selectAllUsers() {
		String selectQuery="select userId, name, age, salary from users";
		List<Users> list=jdbcTemplate.query(selectQuery,new UserMapper());
		return list;
	}

}
