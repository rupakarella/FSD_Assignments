package com.hexaware.hibernatejdbc.service;

import java.util.List;

import com.hexaware.hibernatejdbc.dao.IUsersDao;
import com.hexaware.hibernatejdbc.dao.UsersDaoImp;
import com.hexaware.hibernatejdbc.entity.Users;

public class UsersServiceImp implements IUsersService {
	private IUsersDao dao = new UsersDaoImp();

	@Override
	public Users createUser(Users user) {
		return dao.createUser(user);
	}

	@Override
	public Users updateUser(Users user) {
		return dao.updateUser(user);
	}

	@Override
	public Users deleteUserById(int userId) {
		
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
