package duck_behaviors;

public class NoFly implements Flyable{

	@Override
	public void fly() {
		System.out.println("I cannot fly :( ");
		
	}

}
