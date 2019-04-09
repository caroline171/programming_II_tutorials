package ducks;

import duck_behaviors.Flyable;

public abstract class Duck {

	Flyable flyBehavior;
	Duck(Flyable flyBehavior){
		this.flyBehavior = flyBehavior;
	}
	
	void swim() {
		System.out.println("I can swim");
	}
	
	void quack() {
		System.out.println("I can quack");
	}
	
	void fly() {
		flyBehavior.fly();
	}
	
	abstract void display();
}
