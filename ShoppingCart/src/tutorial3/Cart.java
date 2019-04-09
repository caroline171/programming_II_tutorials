package tutorial3;

import payment.Cash;
import payment.IPayment;

public class Cart {

	private Product[] cartProducts;
	private Customer customer;
	private int productsIndex;
	
	public Cart(Product[] products, Customer customer) {
		this.cartProducts = products;
		this.customer = customer;
		this.productsIndex = 0;
	}
	
	void addProduct(Product product) {
	
		cartProducts[productsIndex++] = product;
	}
	
	int getCartAmount() {
		int amount = 0;
		
		for (Product product : cartProducts) {
			if (product != null) {
				amount += product.getPrice();				
			}
		}	
		amount = (int) ((1.0 - customer.getCustomerDiscount()) * amount);
		return amount;
	}
	
	void pay(IPayment paymentMethod) {
		int amount = this.getCartAmount();
		paymentMethod.pay(amount);
	}
	
}
