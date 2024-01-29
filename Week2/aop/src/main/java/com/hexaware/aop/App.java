package com.hexaware.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.aop.config.AppConfig;
import com.hexaware.aop.exception.InsufficientFundsExp;
import com.hexaware.aop.service.BankService;
/*
 * Author:Rupa
 * Date:23.01.2024
 * Description:App class for running aspects and services
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        BankService service = context.getBean(BankService.class);
        service.login();
        service.deposit();
        service.withdraw();
        service.fundTransfer();
        try {
			service.checkBalance(101);
		} catch (InsufficientFundsExp e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
