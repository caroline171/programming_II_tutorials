package payment;

public class Cash implements IPayment{

	@Override
	public void pay(int amount) {

		System.out.println("Pay Here via Cash " + amount);
	}

}
