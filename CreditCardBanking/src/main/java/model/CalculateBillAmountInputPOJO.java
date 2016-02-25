package model;

public class CalculateBillAmountInputPOJO {

	private float billAmount;
	private String cardType;

	public CalculateBillAmountInputPOJO() {
	}

	public CalculateBillAmountInputPOJO(float billAmount, String cardType) {
		this.billAmount = billAmount;
		this.cardType = cardType;
	}

	public float getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(float billAmount) {
		this.billAmount = billAmount;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

}
