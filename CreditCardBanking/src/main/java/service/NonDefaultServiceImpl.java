package service;

import java.util.List;

import fasade.NonDefaultServiceMappingInterface;
import model.CreditCardCustomerInfoPOJO;
import model.NonDefaultInputPOJO;

public class NonDefaultServiceImpl implements NonDefaultServiceInterface {

	private NonDefaultServiceMappingInterface nonDefaultServiceMapping;

	public NonDefaultServiceImpl(
			NonDefaultServiceMappingInterface nonDefaultServiceMapping) {
		this.nonDefaultServiceMapping = nonDefaultServiceMapping;
	}

	public List<CreditCardCustomerInfoPOJO> callService(String cardType,
			String paymentIndicator) {
		NonDefaultInputPOJO nonDefaultInput = new NonDefaultInputPOJO();
		nonDefaultInput.setCardType(cardType);
		nonDefaultInput.setPaymentIndicator(paymentIndicator);
		return nonDefaultServiceMapping
				.getNonDefaultCustomerList(nonDefaultInput);
	}

}
