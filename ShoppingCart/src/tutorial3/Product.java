package tutorial3;

public class Product {

	private String name;
	private int price;
	private String category;
	
	public Product(String name, String category, int price) {
		this.name = name;
		this.price = price;
		this.category = category;

	}
	
	int getPrice() {
		return this.price;
	}
}
