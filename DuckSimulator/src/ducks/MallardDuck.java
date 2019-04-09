package ducks;

import duck_behaviors.Flyable;

public class MallardDuck extends Duck{

	MallardDuck(Flyable flyBehavior) {
		super(flyBehavior);
	}

	@Override
	void display() {
		System.out.println("I am a Mallard Duck");
	}
}
