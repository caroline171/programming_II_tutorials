package payment;

public class Visa implements IPayment{

	@Override
	public void pay(int amount) {
		System.out.println("Pay Here via Visa " + amount);		
	}
	
}
