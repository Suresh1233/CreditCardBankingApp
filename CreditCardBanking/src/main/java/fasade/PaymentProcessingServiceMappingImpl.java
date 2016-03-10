package fasade;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import business.PaymentProcessingBOInterface;
import model.CreditCardInfoPOJO;
import model.PaymentInfoPOJO;
import model.PaymentProcessingInputPOJO;

public class PaymentProcessingServiceMappingImpl implements
		PaymentProcessingServiceMappingInterface, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private PaymentProcessingBOInterface PaymentProcessingBO;

	public PaymentProcessingServiceMappingImpl() {
	}

	@Transactional
	public String processIncomingPayment(
			PaymentProcessingInputPOJO paymentProcessingInput) {
		String paymentStatus = "";
		try {
			System.out.println("Payment Requested Account Number : "
					+ paymentProcessingInput.getAcctNum());
			CreditCardInfoPOJO CreditCardInfo = PaymentProcessingBO
					.extractCreditCardInfo(paymentProcessingInput.getAcctNum());

			System.out.println("Plastic Number for Account id : "
					+ CreditCardInfo.getCreditcardPlasticId());
			PaymentInfoPOJO newPaymentInfo = new PaymentInfoPOJO();
			newPaymentInfo.setPaymentAcctId(CreditCardInfo
					.getCreditcardAccountId());
			newPaymentInfo.setPaymentPlasticId(CreditCardInfo
					.getCreditcardPlasticId().toString());
			newPaymentInfo.setPaymentAmount(paymentProcessingInput
					.getPaymentAmount().toString());
			newPaymentInfo.setPaymentDate(new Timestamp(new Date().getTime())
					.toString().substring(0, 10));
			newPaymentInfo.setPaymentSuccess("Y");
			PaymentProcessingBO.insertPayment(newPaymentInfo);

			System.out.println("Insert Success");
			CreditCardInfo.setCreditcardDefaultInd("Y");
			PaymentProcessingBO.updatePaymentIndicator(CreditCardInfo);
			paymentStatus = "Payment Success";
		} catch (Exception e) {
			e.printStackTrace();
			paymentStatus = "Payment failed";
		}
		return paymentStatus;

	}
}
