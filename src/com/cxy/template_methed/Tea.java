package com.cxy.template_methed;

public class Tea extends CaffeineBeverage{

	@Override
	void addCondiments() {
		System.out.println("add lemon");
	}

	@Override
	void brew() {
		System.out.println("steep tea bag");
	}

}
