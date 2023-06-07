package com.renatoz.zookeeper;

public class Bat extends Mammal {
	public Bat() {
		energyLevel = 300;
	}
	
	public void fly() {
		System.out.println("The bat takes off!");
		energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println("The bat enjoys a delicious human meal !");
		energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("The town is on fire! The bat attacked it!");
		energyLevel -= 100;
	}

}
