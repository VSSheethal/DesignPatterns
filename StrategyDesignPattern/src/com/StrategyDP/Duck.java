package com.StrategyDP;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	public Duck() {
	}
	public abstract void display();
	public void performFly() {
	flyBehavior.fly();
	}
	public void performQuack() {
	quackBehavior.quack();
	}
	public void swim() {
	System.out.println("All ducks floats, even decoys!");
	}
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
}
