package payment;

public class PymentMethod {

	String type;
	
	void pay (int amount) {
		if(type.equals("cash")){
			// amount payed
			// remaining
			// receipt
			System.out.println("User Payed Via Cash");
		} else if (type.equals("visa")) {
			// connect to bank system
			// take visa number 
			// validate 
			System.out.println("Payed Via Visa Card");
		}
	}
}
