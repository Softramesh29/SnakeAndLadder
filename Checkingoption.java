package com.bridgelabz.SnakeandLadder;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Checkingoption {
}
class SnakeNLadder
{
	
	final static int WINPOINT = 100;
	
	
	static Map<Integer,Integer> snake = new HashMap<Integer,Integer>();
	static Map<Integer,Integer> ladder = new HashMap<Integer,Integer>();
	
	{
		snake.put(96,54);
		snake.put(70,55);
		snake.put(52,42);
		snake.put(35,2);
		snake.put(95,72);
		
		ladder.put(8,22);
		ladder.put(19,80);
		ladder.put(20,85);
		ladder.put(46,70);
		ladder.put(17,69);
	}
	
	public static void main(String[] args)
	{
		Random r = new Random();
		int roll = 1 + r.nextInt(6);
		System.out.println(roll);
	}
}

