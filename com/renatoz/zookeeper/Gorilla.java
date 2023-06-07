package com.renatoz.zookeeper;

public class Gorilla extends Mammal {
	public void throwSomething() {
		System.out.println("The Gorilla has thrown something");
		energyLevel -= 5;
	}
	
	public void eatBannans() {
		System.out.println("The gorilla is satisfied after eating the bannas!");
		energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("The gorilla has climbed a tree!");
		energyLevel -= 100;
	}
}
