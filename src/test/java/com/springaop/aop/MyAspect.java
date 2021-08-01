package com.springaop.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

	@Before("execution(* com.springaop.services.PaymentServiceImpl.makePayment(..))")
	public void printBefore()
	{
		System.out.println("before payment debited");
	}
	@After("execution(* com.springaop.services.PaymentServiceImpl.makePayment(..))")
	public void printafter()
	{
		System.out.println("after payment credited");
	}
}
