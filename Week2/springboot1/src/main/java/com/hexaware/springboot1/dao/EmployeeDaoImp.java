package com.hexaware.springboot1.dao;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImp implements IEmployeeDao {

	@Override
	public boolean showService() {
		System.out.println("No Services");
		return true;
	}

}
