package com.cxy.template_methed;

public abstract class CaffeineBeverage {
	
	//作为一个算法的模板
	//在这个模板里，算法里的每一个步骤都被某个方法代表了
	//某些方法是子类处理的
	public final void prepareRecipe(){
		boilWater();
		brew();
		pourIncup();
		addCondiments();
	}
	
	abstract void addCondiments();

	abstract void brew();

    void boilWater(){
		System.out.println("boil water!");
	}
	void pourIncup(){
		System.out.println("pour in cup!");
	}
	
}
