package dao;

import java.util.List;

import model.CreditCardCustomerInfoPOJO;
import model.CreditCardInfoPOJO;
import model.NonDefaultInputPOJO;
import model.PaymentInfoPOJO;

public interface CreditcardDBDAOInterface {
	public List<CreditCardCustomerInfoPOJO> selectNonDefaultCustomerList(
			NonDefaultInputPOJO nonDefaultInput);

	public CreditCardInfoPOJO extractCreditCardDetail(String acctNum);

	public void insertNewPayment(PaymentInfoPOJO newPaymentInfo);

	public void updatePaymentIndicator(CreditCardInfoPOJO newPaidCreditCardInfo);

}
