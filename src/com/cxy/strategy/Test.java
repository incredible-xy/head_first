package com.cxy.strategy;

public class Test {
	public static void main(String[] args) {
		ModelDuck modelDuck = new ModelDuck();
		modelDuck.display();
		modelDuck.performFly();
		modelDuck.performQuack();
		modelDuck.setFlyBehavior(new FlyWithWings());
		modelDuck.setQuackBehavior(new Squack());
		modelDuck.performFly();
		modelDuck.performQuack();
	}
}
