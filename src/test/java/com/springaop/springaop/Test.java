package com.springaop.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springaop.services.PaymentService;



public class Test {
 
	
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springaop/springaop/config.xml");
		
		PaymentService service = (PaymentService) context.getBean("paymentService");
		
		service.makePayment(1000);
	}
	 
	 
	
}
