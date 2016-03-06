package fasade;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import business.NonDefaultCustomerInterface;
import model.CreditCardCustomerInfoPOJO;
import model.NonDefaultInputPOJO;

public class NonDefaultServiceMappingImpl implements
		NonDefaultServiceMappingInterface, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private NonDefaultCustomerInterface nonDefaultCustomer;

	public NonDefaultServiceMappingImpl() {
	}

	public List<CreditCardCustomerInfoPOJO> getNonDefaultCustomerList(
			NonDefaultInputPOJO nonDefaultInput) {
		return nonDefaultCustomer
				.extractNonDefaultCustomerList(nonDefaultInput);
	}

}
