package fasade;

import java.util.List;

import business.NonDefaultCustomerInterface;
import model.CreditCardCustomerInfoPOJO;
import model.NonDefaultInputPOJO;

public class NonDefaultServiceMappingImpl implements
		NonDefaultServiceMappingInterface {

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
