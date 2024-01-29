package com.hexaware.hibernatejdbc.dao;

import java.util.List;

import com.hexaware.hibernatejdbc.entity.Users;

public interface IUsersDao {
	public Users createUser(Users user);
	public Users updateUser(Users user);
	public Users deleteUserById(int userId);
	public Users selectUserById(int userId);
	public List<Users> selectAllUsers();
}
