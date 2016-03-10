package model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CreditCardInfoMapper implements RowMapper<CreditCardInfoPOJO> {

	public CreditCardInfoPOJO mapRow(ResultSet resultSet, int rowNumber)
			throws SQLException {
		CreditCardInfoPOJO creditCardInfo = new CreditCardInfoPOJO();
		creditCardInfo.setCreditcardAccountId(resultSet
				.getString("CRCD_ACCT_ID"));
		creditCardInfo
				.setCreditcardPlasticId(resultSet.getLong("CRCD_PLST_ID"));
		creditCardInfo.setCreditcardType(resultSet.getString("CRCD_TYPE"));
		creditCardInfo.setCreditcardDueAmount(resultSet
				.getDouble("CRCD_DUE_BALANCE"));
		creditCardInfo.setCreditcardDefaultInd(resultSet
				.getString("CRCD_CUST_DEFAULT_IND"));
		creditCardInfo.setCreditcardDueDate(resultSet
				.getString("CRCD_DUE_DATE"));
		return creditCardInfo;
	}
}
