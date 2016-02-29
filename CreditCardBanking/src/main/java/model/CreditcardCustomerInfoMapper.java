package model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CreditcardCustomerInfoMapper implements
		RowMapper<CreditCardCustomerInfoPOJO> {
	public CreditCardCustomerInfoPOJO mapRow(ResultSet resultSet, int rowNumber)
			throws SQLException {
		CreditCardCustomerInfoPOJO creditcardCustomer = new CreditCardCustomerInfoPOJO();
		creditcardCustomer.setCustomerID(resultSet.getString("CUST_ID"));
		creditcardCustomer.setCustomerName(resultSet.getString("CUST_NAME"));
		creditcardCustomer.setCustomerAddress(resultSet.getString("CUST_ADDR"));
		creditcardCustomer.setCustomerPhone(resultSet.getLong("CUST_PHONE"));
		creditcardCustomer.setCustomerEmail(resultSet.getString("CUST_EMAIL"));
		creditcardCustomer.setCreditcardAccountId(resultSet
				.getLong("CRCD_ACCT_ID"));
		creditcardCustomer.setCreditcardPlasticId(resultSet
				.getLong("CRCD_PLST_ID"));
		creditcardCustomer.setCreditcardType(resultSet.getString("CRCD_TYPE"));
		creditcardCustomer.setCreditcardDueAmount(resultSet
				.getDouble("CRCD_DUE_BALANCE"));
		creditcardCustomer.setCreditcardDefaultInd(resultSet
				.getString("CRCD_CUST_DEFAULT_IND"));
		creditcardCustomer.setCreditcardDueDate(resultSet
				.getString("CRCD_DUE_DATE"));
		return creditcardCustomer;
	}

}
