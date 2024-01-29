package com.hexaware.policymanagement.service;

import java.util.List;

import com.hexaware.policymanagement.entity.Users;

public interface IUsersService {
	public Users createUser(Users user);
	public Users updateUser(Users user);
	public void deleteByUserId(int userId);
	public Users getById(int userId);
    public Users getUserByEmail(String eMail);
    public List<Users> getUserByUserType(String userType);
    public Users getUserByMobNo(String mobNo);
	public List<Users> getAllUser();
}
