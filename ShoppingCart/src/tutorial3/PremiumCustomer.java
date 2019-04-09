package tutorial3;

public class PremiumCustomer extends Customer{

	public PremiumCustomer(String name) {
		super(name);
	}

	@Override
	double getCustomerDiscount() {
		return 0.2;
	}
}
