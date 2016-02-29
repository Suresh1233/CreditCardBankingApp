package service;

import java.util.List;

import model.CreditCardCustomerInfoPOJO;

public interface NonDefaultServiceInterface {
	public List<CreditCardCustomerInfoPOJO> callService(String cardType, String paymentIndicator);

}
