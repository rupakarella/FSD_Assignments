package com.hexaware.springboot1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springboot1.dao.IEmployeeDao;

@Service
public class EmployeeServiceImp implements IEmployeeService {
	@Autowired
	IEmployeeDao dao;
	@Override
	public boolean showService() {
		return dao.showService();

	}

}
