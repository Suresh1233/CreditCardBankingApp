package service;

import java.io.Serializable;

import model.CalculateBillAmountInputPOJO;
import fasade.CalculateBillAmountServiceMappingInterface;

public class CalculateBillAmountServiceImpl implements
		CalculateBillAmountServiceInterface, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CalculateBillAmountServiceMappingInterface calculateBillAmountServiceMapping;

	public CalculateBillAmountServiceImpl(
			CalculateBillAmountServiceMappingInterface calculateBillAmountServiceMapping) {
		this.calculateBillAmountServiceMapping = calculateBillAmountServiceMapping;
	}

	public Double callService(String cardType, float billAmount) {
		CalculateBillAmountInputPOJO userInputValue = new CalculateBillAmountInputPOJO();
		userInputValue.setCardType(cardType);
		userInputValue.setBillAmount(billAmount);
		return calculateBillAmountServiceMapping
				.getTotalBillAmount(userInputValue);
	}
}
