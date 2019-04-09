package ducks;

import duck_behaviors.Flyable;

public class RedNeckDuck extends Duck {

	RedNeckDuck(Flyable flyBehavior) {
		super(flyBehavior);
	}

	@Override
	void display() {
		System.out.println("I am a Red Neck Duck");
	}
}
