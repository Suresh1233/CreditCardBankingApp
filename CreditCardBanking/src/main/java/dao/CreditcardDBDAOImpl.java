package dao;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import model.CreditCardInfoMapper;
import model.CreditCardCustomerInfoPOJO;
import model.CreditCardInfoPOJO;
import model.CreditcardCustomerInfoMapper;
import model.NonDefaultInputPOJO;
import model.PaymentInfoPOJO;

public class CreditcardDBDAOImpl implements CreditcardDBDAOInterface,
		Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private JdbcTemplate creditcardDatabaseJdbcTemplate;

	public CreditcardDBDAOImpl() {
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

	public CreditCardInfoPOJO extractCreditCardDetail(String acctNum) {

		String SQL = "select CRCD_ACCT_ID," + " CRCD_PLST_ID, " + "CRCD_TYPE, "
				+ "CRCD_DUE_BALANCE, " + "CRCD_CUST_DEFAULT_IND, "
				+ "CRCD_DUE_DATE " + "from CRCD_TABLE "
				+ "where CRCD_ACCT_ID=?";
		CreditCardInfoPOJO creditCardInfo = creditcardDatabaseJdbcTemplate
				.queryForObject(SQL, new Object[] { acctNum },
						new CreditCardInfoMapper());
		return creditCardInfo;
	}

	public void insertNewPayment(PaymentInfoPOJO newPaymentInfo) {
		String SQL = "insert into " + "PYMT_TABLE(PYMT_ACCT_ID, "
				+ "PYMT_PLST_ID, " + "PYMT_AMOUNT, " + "PYMT_DATE, "
				+ "PYMT_SUCCESS, " + "PYMT_CREATE_TIMESTAMP) "
				+ "values(?,?,?,?,?,?)";
		creditcardDatabaseJdbcTemplate.update(
				SQL,
				new Object[] { newPaymentInfo.getPaymentAcctId(),
						newPaymentInfo.getPaymentPlasticId(),
						newPaymentInfo.getPaymentAmount(),
						newPaymentInfo.getPaymentDate(),
						newPaymentInfo.getPaymentSuccess(),
						new Timestamp(new Date().getTime()).toString() });
	}

	public void updatePaymentIndicator(CreditCardInfoPOJO newPaidCreditCardInfo) {
		String SQL = "update CRCD_TABLE " + "set CRCD_CUST_DEFAULT_IND = ? "
				+ "where  CRCD_ACCT_ID=?";
		creditcardDatabaseJdbcTemplate.update(SQL, new Object[] {
				newPaidCreditCardInfo.getCreditcardDefaultInd(),
				newPaidCreditCardInfo.getCreditcardAccountId() });
	}
}
