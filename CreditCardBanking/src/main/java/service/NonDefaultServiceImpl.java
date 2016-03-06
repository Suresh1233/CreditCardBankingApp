package service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fasade.NonDefaultServiceMappingInterface;
import model.CreditCardCustomerInfoPOJO;
import model.NonDefaultInputPOJO;

public class NonDefaultServiceImpl implements NonDefaultServiceInterface,
		Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private NonDefaultServiceMappingInterface nonDefaultServiceMapping;

	public NonDefaultServiceImpl() {
	}

	@Autowired
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
