package com.hexaware.springcore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springcore.dao.IDao;

@Service
public class ServiceImp implements IService {
	@Autowired
	IDao dao;
	
	@Override
	public void getService() {
		System.out.println("service method executed");
		System.out.println("service got DAO object"+dao);
		dao.getDao();

	}

}
