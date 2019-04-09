package Collections;

public class Account<T> {
	
	T currency;
	
	public Account(T currency) {
		// TODO Auto-generated constructor stub
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "I am an account" + currency;
	}
}
