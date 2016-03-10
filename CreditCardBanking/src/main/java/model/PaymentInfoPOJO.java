package model;

public class PaymentInfoPOJO {
	private String paymentAcctId;
	private String PaymentPlasticId;
	private String paymentAmount;
	private String paymentDate;
	private String paymentSuccess;

	public String getPaymentAcctId() {
		return paymentAcctId;
	}

	public void setPaymentAcctId(String paymentAcctId) {
		this.paymentAcctId = paymentAcctId;
	}

	public String getPaymentPlasticId() {
		return PaymentPlasticId;
	}

	public void setPaymentPlasticId(String paymentPlasticId) {
		PaymentPlasticId = paymentPlasticId;
	}

	public String getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getPaymentSuccess() {
		return paymentSuccess;
	}

	public void setPaymentSuccess(String paymentSuccess) {
		this.paymentSuccess = paymentSuccess;
	}
}
