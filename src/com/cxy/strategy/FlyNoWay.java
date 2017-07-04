package com.cxy.strategy;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("Is can not fly");
	}

}
