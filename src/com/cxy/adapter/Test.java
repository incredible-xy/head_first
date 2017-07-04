package com.cxy.adapter;

public class Test {
	public static void main(String[] args) {
		MallardDuck mallardDuck = new MallardDuck();
		WildTurkey wildTurkey = new WildTurkey();
		
		TurkeyAdapter adapter = new TurkeyAdapter(wildTurkey);
		adapter.quack();
		adapter.fly();
 	}
}
