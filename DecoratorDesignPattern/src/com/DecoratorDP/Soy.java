package com.DecoratorDP;

public class Soy extends Beverage{
	Beverage beverage;
	public Soy(Beverage beverage) {
		this.beverage=beverage;
	}
	public String getDescription() {
		return beverage.getDescription() + ",Soy";
	}
	
	public double cost() {
		return .15 + beverage.cost();
	}

}
