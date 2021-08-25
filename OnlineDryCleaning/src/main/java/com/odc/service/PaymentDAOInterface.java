package com.odc.service;

import java.util.List;

import com.odc.model.Payment;

public interface PaymentDAOInterface {
	
	
	public Payment addPayment(Payment payment);
	public Payment removePayment(long id);
	public Payment updatePayment( Payment payment);
	public Payment getPaymentDetails(long id);
	public List<Payment> getAllPaymentDetails();


}
