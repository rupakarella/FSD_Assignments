package com.hexaware.userspringjdbc.dao;

import java.util.List;

import com.hexaware.userspringjdbc.model.Users;

public interface IUsersDao {
	public boolean createUser(Users user);
	public boolean updateUser(Users user);
	public boolean deleteUserById(int userId);
	public Users selectUserById(int userId);
	public List<Users> selectAllUsers();
}
