package tutorial3;

public class Store {
	
	private String name;

	Store(String name){
		this.name = name;
	}
	
	void greet() {
		System.out.println("Hello from " + this.name);
	}
}
