package fasade;

import java.io.Serializable;

import model.CalculateBillAmountInputPOJO;
import business.CalculateBillAmountInterface;

public class CalculateBillAmountServiceMappingImpl implements
		CalculateBillAmountServiceMappingInterface, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CalculateBillAmountInterface calculateBillAmount;

	public CalculateBillAmountInterface getCalculateBillAmount() {
		return calculateBillAmount;
	}

	public void setCalculateBillAmount(
			CalculateBillAmountInterface calculateBillAmount) {
		this.calculateBillAmount = calculateBillAmount;
	}

	public Double getTotalBillAmount(CalculateBillAmountInputPOJO userInputValue) {
		return calculateBillAmount.calculateTotalBillAmount(userInputValue);
	}

}
