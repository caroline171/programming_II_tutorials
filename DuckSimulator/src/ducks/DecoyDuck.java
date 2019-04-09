package ducks;

import duck_behaviors.Flyable;

public class DecoyDuck extends Duck {

	public DecoyDuck(Flyable flyBehavior) {
		super(flyBehavior);
		// TODO Auto-generated constructor stub
	}

	@Override
	void display() {
		System.out.println("I am a Decoy wooden duck");
	}

}
