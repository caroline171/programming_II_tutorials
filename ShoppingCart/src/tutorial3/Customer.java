package tutorial3;

public class Customer {

	private String name;
	
	public Customer(String name) {
		this.name = name;
	}
	
	double getCustomerDiscount() {
		return 0.0;
	}
	
	void greetCustomer() {
		System.err.println("Hello, My name is "+ this.name);
	}
}
