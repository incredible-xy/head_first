package com.cxy.strategy;

public class Squack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("squack!");
	}

}
