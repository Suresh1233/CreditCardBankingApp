package model;

public class CreditCardInfoPOJO {
	private String creditcardAccountId;
	private Long creditcardPlasticId;
	private String creditcardType;
	private Double creditcardDueAmount;
	private String creditcardDefaultInd;
	private String creditcardDueDate;

	public String getCreditcardAccountId() {
		return creditcardAccountId;
	}

	public void setCreditcardAccountId(String creditcardAccountId) {
		this.creditcardAccountId = creditcardAccountId;
	}

	public Long getCreditcardPlasticId() {
		return creditcardPlasticId;
	}

	public void setCreditcardPlasticId(Long creditcardPlasticId) {
		this.creditcardPlasticId = creditcardPlasticId;
	}

	public String getCreditcardType() {
		return creditcardType;
	}

	public void setCreditcardType(String creditcardType) {
		this.creditcardType = creditcardType;
	}

	public Double getCreditcardDueAmount() {
		return creditcardDueAmount;
	}

	public void setCreditcardDueAmount(Double creditcardDueAmount) {
		this.creditcardDueAmount = creditcardDueAmount;
	}

	public String getCreditcardDefaultInd() {
		return creditcardDefaultInd;
	}

	public void setCreditcardDefaultInd(String creditcardDefaultInd) {
		this.creditcardDefaultInd = creditcardDefaultInd;
	}

	public String getCreditcardDueDate() {
		return creditcardDueDate;
	}

	public void setCreditcardDueDate(String creditcardDueDate) {
		this.creditcardDueDate = creditcardDueDate;
	}
}
