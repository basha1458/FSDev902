package com.nt.paymentService;

public class PaymentServiceOperation {

	public String doDebitCardPayment() {
		return "Payment done successfully! through Debit card ";
	}

	public String doCreditCardPayment() {
		return "Payment done successfully! through Credit card ";
	}
	
	public String doUPICardPayment() {
		return "Payment done successfully! through UPI ";
	}
	public String doNetBankingCardPayment() {
		return "Payment done successfully! through NetBanking";
	}
	
}
