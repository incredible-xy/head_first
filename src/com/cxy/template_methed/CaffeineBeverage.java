package com.cxy.template_methed;

public abstract class CaffeineBeverage {
	
	//��Ϊһ���㷨��ģ��
	//�����ģ����㷨���ÿһ�����趼��ĳ������������
	//ĳЩ���������ദ���
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
