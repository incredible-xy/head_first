package com.cxy.strategy;

public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("i am flying with wings!");
	}

}
