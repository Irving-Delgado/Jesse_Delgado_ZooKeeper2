package com.codingdojo.zookeeper.part2;

public class Mammal {
	public int energyLevel = 300;
	
	public int displayEnergy() {
		System.out.println("Your energy level is at, "+energyLevel);
		return energyLevel;
	}
}
