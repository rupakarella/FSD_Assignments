package com.hexaware.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.hexaware.aop.exception.InsufficientFundsExp;

@Component
@Aspect
public class LoggingAspect {
	@Before("execution(* com.hexaware.aop.service.BankService.*())")
	public void beforeLogs()
	{
		System.out.println("Log before any bank service");
	}
	@After("execution(* com.hexaware.aop.service.BankService.fundTransfer())")
	public void afterLogs()
	{
		System.out.println("Log after any fund transfer service");
	}
	@Pointcut("execution(* com.hexaware.aop.service.BankService.checkBalance(..))")	
	public void afterReturningPointCut()
	{
		
	}
	@AfterReturning(pointcut="afterReturningPointCut()",returning="balance")
	public void afterReturningBalance(int balance)
	{
		System.out.println("Logs after returning balance amount:"+balance);
	}
	@AfterThrowing(pointcut="afterReturningPointCut()",throwing="e")
	public void afterThrowingExp(InsufficientFundsExp e)
	{
		System.out.println("Logs after throwing exp:"+e);
	}
	
}
