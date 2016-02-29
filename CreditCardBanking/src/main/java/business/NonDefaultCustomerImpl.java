package business;

import java.util.List;

import dao.CreditcardDBDAOInterface;
import model.CreditCardCustomerInfoPOJO;
import model.NonDefaultInputPOJO;

public class NonDefaultCustomerImpl implements NonDefaultCustomerInterface {

	private CreditcardDBDAOInterface creditcardDBDAOInterface;

	public NonDefaultCustomerImpl(
			CreditcardDBDAOInterface creditcardDBDAOInterface) {
		this.creditcardDBDAOInterface = creditcardDBDAOInterface;
	}

	public List<CreditCardCustomerInfoPOJO> extractNonDefaultCustomerList(
			NonDefaultInputPOJO nonDefaultInput) {
		return creditcardDBDAOInterface
				.selectNonDefaultCustomerList(nonDefaultInput);
	}

}
