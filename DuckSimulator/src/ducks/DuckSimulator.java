package ducks;

import duck_behaviors.*;

public class DuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck(new FlyWithWings());
		Duck redNeck = new RedNeckDuck(new FlyWithWings());
		Duck donald = new DonaldDuck(new NoFly());
		Duck decoy = new DecoyDuck(new NoFly());

		simulateDuck(mallard);
		simulateDuck(redNeck);
		simulateDuck(donald);		
		simulateDuck(decoy);	
	}
	
	
	static void simulateDuck(Duck duck){
		duck.quack();
		duck.swim();
		duck.fly();
		duck.display();
		System.out.println("===============================");
	}

}
