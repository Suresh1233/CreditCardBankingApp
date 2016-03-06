package business;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dao.CreditcardDBDAOInterface;
import model.CreditCardCustomerInfoPOJO;
import model.NonDefaultInputPOJO;

public class NonDefaultCustomerImpl implements NonDefaultCustomerInterface,
		Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CreditcardDBDAOInterface creditcardDBDAOInterface;

	public NonDefaultCustomerImpl() {
	}
	
	@Autowired
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
