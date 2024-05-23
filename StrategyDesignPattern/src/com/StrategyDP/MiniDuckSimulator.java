package com.StrategyDP;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		System.out.println("----------------------------------------------------------");
		Duck rubber = new RubberDuck();
		rubber.performQuack();
		System.out.println("----------------------------------------------------------");
		Duck decoy = new DecoyDuck();
		System.out.println("----------------------------------------------------------");
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}

}
