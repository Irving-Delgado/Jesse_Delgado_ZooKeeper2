package com.codingdojo.zookeeper.part2;

public class BatTest {
	public static void main(String[] args) {
		Bat giant = new Bat();
		giant.displayEnergy();
		giant.attackTown();
		giant.attackTown();
		giant.attackTown();
		giant.eatHumans();
		giant.eatHumans();
		giant.fly();
		giant.fly();
		
		if(giant.energyLevel<0) {
			System.out.println("The bat had reached, "+giant.energyLevel+" The bat had died the town is safe! Yay!");
		}
	}

}
