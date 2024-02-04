package com.hexaware.springrestuser.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springrestuser.entities.Users;
import com.hexaware.springrestuser.repository.UsersRepository;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class UsersServiceImp implements IUsersService {
	@Autowired
	UsersRepository repo;
	@Override
	public Users addUser(Users user) {
		
		return repo.save(user);
	}

	@Override
	public Users updateUser(Users user) {
		
		return repo.save(user);
	}

	@Override
	public String deleteUser(long userId) {
		repo.deleteById(userId);
		return userId+" record deleted";
	}

	@Override
	public Users getById(long userId) {
		return repo.findById(userId).orElse(null);
	}

	@Override
	public List<Users> getAll() {
		
		return repo.findAll();
	}

	@Override
	public List<Users> findBySalaryLT(double salary) {
		return repo.findBySalaryLessThan(salary);
	}

	@Override
	public List<Users> BySalRange(double min, double max) {
		return repo.BySalRange(min, max);
	}

	@Override
	public String deleteByEname(String userName) {
		int count= repo.deleteByUsername(userName);
		return count + " records deleted";
	}

}
