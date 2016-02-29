package model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(includeFieldNames = true)
public class CreditCardCustomerInfoPOJO {
	private String customerID;
	private String customerName;
	private String customerAddress;
	private Long customerPhone;
	private String customerEmail;
	private Long creditcardAccountId;
	private Long creditcardPlasticId;
	private String creditcardType;
	private Double creditcardDueAmount;
	private String creditcardDefaultInd;
	private String creditcardDueDate;

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public Long getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(Long customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public Long getCreditcardAccountId() {
		return creditcardAccountId;
	}

	public void setCreditcardAccountId(Long creditcardAccountId) {
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
	
	@Override
	public String toString() {
		return "customerID : " + getCustomerID() + "\n" +
				"customerName : " + getCustomerName() + "\n" +
				"customerAddress : " + getCustomerAddress() + "\n" +
				"customerPhone : " + getCustomerPhone() + "\n" +
				"customerEmail : " + getCustomerEmail() + "\n" +
				"creditcardAccountId : " + getCreditcardAccountId() + "\n" +
				"creditcardPlasticId : " + getCreditcardPlasticId() + "\n" +
				"creditcardType : " + getCreditcardType() + "\n" +
				"creditcardDueAmount : " + getCreditcardDueAmount() + "\n" +
				"creditcardDefaultInd : " + getCreditcardDefaultInd() + "\n" +
				"creditcardDueDate : " + getCreditcardDueDate() + "\n";
	}

}
