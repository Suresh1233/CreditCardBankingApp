package fasade;

import java.io.Serializable;
import java.util.List;

import business.NonDefaultCustomerInterface;
import model.CreditCardCustomerInfoPOJO;
import model.NonDefaultInputPOJO;

public class NonDefaultServiceMappingImpl implements
		NonDefaultServiceMappingInterface, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private NonDefaultCustomerInterface nonDefaultCustomer;

	public NonDefaultCustomerInterface getNonDefaultCustomer() {
		return nonDefaultCustomer;
	}

	public void setNonDefaultCustomer(
			NonDefaultCustomerInterface nonDefaultCustomer) {
		this.nonDefaultCustomer = nonDefaultCustomer;
	}

	public List<CreditCardCustomerInfoPOJO> getNonDefaultCustomerList(
			NonDefaultInputPOJO nonDefaultInput) {
		return nonDefaultCustomer
				.extractNonDefaultCustomerList(nonDefaultInput);
	}

}
