package com.DecoratorDP;

public class SteamedMilk extends Beverage{
	Beverage beverage;
	public SteamedMilk(Beverage beverage) {
		this.beverage=beverage;
	}
	public String getDescription() {
		return beverage.getDescription() + ",Steamed Milk";
	}
	
	public double cost() {
		return .10 + beverage.cost();
	}

}
