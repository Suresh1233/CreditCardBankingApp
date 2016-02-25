package model;

public class DefaulterServicePOJO {
	private String userCardType;
	private byte defaultIndicator;

	public DefaulterServicePOJO() {
	}

	public String getUserCardType() {
		return userCardType;
	}

	public void setUserCardType(String userCardType) {
		this.userCardType = userCardType;
	}

	public byte getDefaultIndicator() {
		return defaultIndicator;
	}

	public void setDefaultIndicator(byte defaultIndicator) {
		this.defaultIndicator = defaultIndicator;
	}

}
