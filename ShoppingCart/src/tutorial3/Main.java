package tutorial3;

import books.Librarian;
import books.Library;
import books.Printable;
import payment.Cash;
import payment.Visa;

public class Main {

	public static void main(String[] args) {
		
//		Printable library = new Library();
//		Printable librarian = new Librarian();
//		library.print();
//		librarian.print();
		
		
		
		Store carrefour = new Store("Carrefour");
		Store metro = new Store("Metro");
		carrefour.greet();
		metro.greet();
		
		Product cheese = new Product("Cheese", "Grocery", 10);
		Product milk = new Product("Milk", "Grocery", 5);
		Product dress = new Product("Dress", "Clothes", 50);
		Product chocolate = new Product("Chocolate", "Sweets", 15);
		
		Customer aly = new Customer("Aly");
		PremiumCustomer ahmed = new PremiumCustomer("Ahmed");
		
		
		Cart cartToday = new Cart(new Product[10], aly);
		
		cartToday.addProduct(cheese);
		cartToday.addProduct(cheese);
		cartToday.addProduct(milk);
		
		Cart ahmedsCart = new Cart(new Product[10], ahmed);
		ahmedsCart.addProduct(cheese);
		ahmedsCart.addProduct(cheese);
		ahmedsCart.addProduct(milk);


		System.out.println("Aly's Cart invoice is : " + cartToday.getCartAmount());
		System.out.println("Ahmed's Cart invoice is : " + ahmedsCart.getCartAmount());

		
		cartToday.pay(new Cash());
		cartToday.pay(new Visa());

	}

	
}
