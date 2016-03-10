package service;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import fasade.PaymentProcessingServiceMappingInterface;
import model.PaymentProcessingInputPOJO;

public class PaymentProcessingServiceImpl implements
		PaymentProcessingServiceInterface, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PaymentProcessingServiceMappingInterface paymentProcessingServiceMapping;

	public PaymentProcessingServiceImpl() {
	}

	@Autowired
	public PaymentProcessingServiceImpl(
			PaymentProcessingServiceMappingInterface paymentProcessingServiceMapping) {
		this.paymentProcessingServiceMapping = paymentProcessingServiceMapping;
	}

	public String processUserPayment(String acctNum, Double paymentAmount) {
		PaymentProcessingInputPOJO PaymentProcessingInput = new PaymentProcessingInputPOJO();
		PaymentProcessingInput.setAcctNum(acctNum);
		PaymentProcessingInput.setPaymentAmount(paymentAmount);
		return paymentProcessingServiceMapping
				.processIncomingPayment(PaymentProcessingInput);
	}
}
