package business;

import model.CalculateBillAmountInputPOJO;

public interface CalculateBillAmountInterface {
	public Double calculateTotalBillAmount(
			CalculateBillAmountInputPOJO userInputValue);

}
