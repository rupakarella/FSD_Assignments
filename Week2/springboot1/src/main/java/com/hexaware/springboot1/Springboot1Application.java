package com.hexaware.springboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hexaware.springboot1.service.EmployeeServiceImp;
import com.hexaware.springboot1.service.IEmployeeService;

@SpringBootApplication
public class Springboot1Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Springboot1Application.class, args);
		IEmployeeService service = context.getBean(EmployeeServiceImp.class);
		service.showService();
	
	}

}
