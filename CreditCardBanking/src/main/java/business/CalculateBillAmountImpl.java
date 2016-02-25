package business;

import java.io.Serializable;
import java.util.Map;

import model.CalculateBillAmountInputPOJO;

public class CalculateBillAmountImpl implements CalculateBillAmountInterface,
		Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Map<String, Float> cardInterestRate;

	public Map<String, Float> getCardInterestRate() {
		return cardInterestRate;
	}

	public void setCardInterestRate(Map<String, Float> cardInterestRate) {
		this.cardInterestRate = cardInterestRate;
	}

	public Double calculateTotalBillAmount(
			CalculateBillAmountInputPOJO userInputValue) {
		Double totalBillAmount = (double) (userInputValue.getBillAmount() + (userInputValue
				.getBillAmount() * cardInterestRate.get(userInputValue
				.getCardType())) / 100);
		return totalBillAmount;
	}

}
