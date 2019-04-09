package ducks;

import duck_behaviors.Flyable;

public class DonaldDuck extends Duck {

	public DonaldDuck(Flyable flyBehavior) {
		super(flyBehavior);
		// TODO Auto-generated constructor stub
	}

	@Override
	void display() {
			
		System.out.println("I am donald duck");
	}

}
