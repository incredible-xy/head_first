package com.cxy.strategy;

public class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("silence!");
	}

}
