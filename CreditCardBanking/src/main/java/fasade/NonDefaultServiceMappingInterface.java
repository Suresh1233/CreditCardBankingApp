package fasade;

import java.util.List;

import model.CreditCardCustomerInfoPOJO;
import model.NonDefaultInputPOJO;

public interface NonDefaultServiceMappingInterface {
	public List<CreditCardCustomerInfoPOJO> getNonDefaultCustomerList(
			NonDefaultInputPOJO nonDefaultInput);

}
