package com.codingdojo.zookeeper.part2;

public class Bat extends Mammal {
	public void fly() {
		energyLevel -= 50;
		System.out.println("Swoosh, Swoosh! The Bat is flying, energy levels has gone down to, "+energyLevel);
	}
	public void eatHumans() {
		energyLevel +=25;
		System.out.println("Munch, Munch! The Bat is eating, the energy levels has gone down to, "+energyLevel);
	}
	public void attackTown() {
		energyLevel -=100;
		System.out.println("Boosh, Boosh! The Bat is attacking a town, the energy levels has gone down to, "+energyLevel);
	}
}
