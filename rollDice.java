package com.bridgelabz.SnakeandLadder;

import java.util.Random;

public class rollDice {
	public static void main(String[] args) {
		Random r = new Random();
		int roll = 1 + r.nextInt(6);
		System.out.println(roll);
	}
}



