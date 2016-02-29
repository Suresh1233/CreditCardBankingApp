package dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import model.CreditCardCustomerInfoPOJO;
import model.CreditcardCustomerInfoMapper;
import model.NonDefaultInputPOJO;

public class CreditcardDBDAOImpl implements CreditcardDBDAOInterface {

	private JdbcTemplate creditcardDatabaseJdbcTemplate;

	public JdbcTemplate getCreditcardDatabaseJdbcTemplate() {
		return creditcardDatabaseJdbcTemplate;
	}

	public void setCreditcardDatabaseJdbcTemplate(
			JdbcTemplate creditcardDatabaseJdbcTemplate) {
		this.creditcardDatabaseJdbcTemplate = creditcardDatabaseJdbcTemplate;
	}

	public List<CreditCardCustomerInfoPOJO> selectNonDefaultCustomerList(
			NonDefaultInputPOJO nonDefaultInput) {
		String SQL = "select A.CUST_ID, " + "A.CUST_NAME, " + "A.CUST_ADDR, "
				+ "A.CUST_PHONE, " + "A.CUST_EMAIL, " + "B.CRCD_ACCT_ID, "
				+ "B.CRCD_PLST_ID, " + "B.CRCD_TYPE, " + "B.CRCD_DUE_BALANCE, "
				+ "B.CRCD_CUST_DEFAULT_IND, " + "B.CRCD_DUE_DATE "
				+ "from CUST_TABLE A inner join CRCD_TABLE B "
				+ "on A.CUST_ID = B.CRCD_CUST_ID " + "where "
				+ "B.CRCD_TYPE=? " + "and " + "B.CRCD_CUST_DEFAULT_IND=?";
		List<CreditCardCustomerInfoPOJO> CreditCardCustomersList = creditcardDatabaseJdbcTemplate
				.query(SQL, new Object[] { nonDefaultInput.getCardType(),
						nonDefaultInput.getPaymentIndicator() },
						new CreditcardCustomerInfoMapper());
		return CreditCardCustomersList;
	}
}
