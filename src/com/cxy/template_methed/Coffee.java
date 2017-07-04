package com.cxy.template_methed;

public class Coffee extends CaffeineBeverage{

	@Override
	void addCondiments() {
		System.out.println("add suger and milk");
	}

	@Override
	void brew() {
		System.out.println("brew coffee grinds");	
	}

}
