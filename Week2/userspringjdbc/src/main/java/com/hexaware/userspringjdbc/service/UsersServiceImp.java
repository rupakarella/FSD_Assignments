package com.hexaware.userspringjdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.userspringjdbc.dao.IUsersDao;
import com.hexaware.userspringjdbc.model.Users;
@Service
public class UsersServiceImp implements IUsersService {
	@Autowired
	IUsersDao dao;
	@Override
	public boolean createUser(Users user) {
		
		return dao.createUser(user);
	}

	@Override
	public boolean updateUser(Users user) {
		
		return dao.updateUser(user);
	}

	@Override
	public boolean deleteUserById(int userId) {
		
		return dao.deleteUserById(userId);
	}

	@Override
	public Users selectUserById(int userId) {
		
		return dao.selectUserById(userId);
	}

	@Override
	public List<Users> selectAllUsers() {
		
		return dao.selectAllUsers();
	}

}
