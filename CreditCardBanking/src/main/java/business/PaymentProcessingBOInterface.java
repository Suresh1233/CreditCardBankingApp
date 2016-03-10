package business;

import model.CreditCardInfoPOJO;
import model.PaymentInfoPOJO;

public interface PaymentProcessingBOInterface {
	public CreditCardInfoPOJO extractCreditCardInfo(String acctNum);

	public void insertPayment(PaymentInfoPOJO newPayment);

	public void updatePaymentIndicator(CreditCardInfoPOJO updatedCreditCardInfo);
}
