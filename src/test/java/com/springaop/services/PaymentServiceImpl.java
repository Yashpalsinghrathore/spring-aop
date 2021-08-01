package com.springaop.services;

public class PaymentServiceImpl implements PaymentService {

	public void makePayment(int amount) {
		
		System.out.println(amount+"ammount debited");
		
		System.out.println(amount+"amount credited");
		
	}

}
