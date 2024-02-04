package com.hexaware.springrestuser.service;

import java.util.List;

import com.hexaware.springrestuser.entities.Users;

public interface IUsersService {
	public Users addUser(Users user);
	public Users updateUser(Users user);
	public String deleteUser(long userId);
	public Users getById(long userId);
	public List<Users> getAll();
	public List<Users> findBySalaryLT(double salary);
	public List<Users> BySalRange(double min,double max);
	public String deleteByEname(String userName);
}
