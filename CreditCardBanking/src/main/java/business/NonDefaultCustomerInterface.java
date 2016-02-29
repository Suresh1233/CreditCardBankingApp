package business;

import java.util.List;

import model.CreditCardCustomerInfoPOJO;
import model.NonDefaultInputPOJO;

public interface NonDefaultCustomerInterface {
	public List<CreditCardCustomerInfoPOJO> extractNonDefaultCustomerList(
			NonDefaultInputPOJO nonDefaultInput);

}
