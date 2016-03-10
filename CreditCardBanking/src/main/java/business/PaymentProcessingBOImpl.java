package business;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import dao.CreditcardDBDAOInterface;
import model.CreditCardInfoPOJO;
import model.PaymentInfoPOJO;

public class PaymentProcessingBOImpl implements PaymentProcessingBOInterface,
		Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CreditcardDBDAOInterface creditcardDBDAO;

	public PaymentProcessingBOImpl() {
	}

	@Autowired
	public PaymentProcessingBOImpl(CreditcardDBDAOInterface creditcardDBDAO) {
		this.creditcardDBDAO = creditcardDBDAO;
	}

	public CreditCardInfoPOJO extractCreditCardInfo(String acctNum) {
		return creditcardDBDAO.extractCreditCardDetail(acctNum);
	}

	public void insertPayment(PaymentInfoPOJO newPayment) {
		creditcardDBDAO.insertNewPayment(newPayment);
	}

	public void updatePaymentIndicator(CreditCardInfoPOJO updatedCreditCardInfo) {
		creditcardDBDAO.updatePaymentIndicator(updatedCreditCardInfo);
	}
}
