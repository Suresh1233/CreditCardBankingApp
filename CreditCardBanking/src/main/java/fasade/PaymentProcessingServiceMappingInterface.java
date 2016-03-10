package fasade;

import model.PaymentProcessingInputPOJO;

public interface PaymentProcessingServiceMappingInterface {
	public String processIncomingPayment(
			PaymentProcessingInputPOJO paymentProcessingInput);

}
