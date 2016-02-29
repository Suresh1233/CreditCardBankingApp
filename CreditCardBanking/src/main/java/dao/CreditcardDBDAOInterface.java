package dao;

import java.util.List;

import model.CreditCardCustomerInfoPOJO;
import model.NonDefaultInputPOJO;

public interface CreditcardDBDAOInterface {
	public List<CreditCardCustomerInfoPOJO> selectNonDefaultCustomerList(
			NonDefaultInputPOJO nonDefaultInput);

}
