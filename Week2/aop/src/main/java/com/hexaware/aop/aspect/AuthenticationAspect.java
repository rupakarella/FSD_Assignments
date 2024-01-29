package com.hexaware.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AuthenticationAspect {
	@Pointcut("execution(* com.hexaware.aop.service.BankService.login())")
	public void authentication()
	{
		
	}
	@Pointcut("execution(* com.hexaware.aop.service.BankService.*())")
	public void authorization()
	{
		
	}
	@Before("authentication()||authorization()")
	public void authenticationAuthorization()
	{
		System.out.println("Login verified user login success and authorization is verified");
	}
}
