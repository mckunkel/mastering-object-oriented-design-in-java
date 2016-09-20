
public class AccountsReceiveable {

	private Accounting transactionObject;

	public AccountsReceiveable(Accounting aTransaction) {
		transactionObject = aTransaction;
	}

	public void postPayment() {
		transactionObject.chargeCustomer();
	}

	public void sendInvoice() {
		transactionObject.prepareInvoice();
	}

}
