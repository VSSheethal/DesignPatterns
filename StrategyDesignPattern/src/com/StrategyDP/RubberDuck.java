package com.StrategyDP;

public class RubberDuck extends Duck{
	public RubberDuck(){
		quackBehavior = new Squeak();
	}
	
	public void display() {
		System.out.println("I'm a real Ruber duck");
	}
}
