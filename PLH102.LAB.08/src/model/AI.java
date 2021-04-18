package model;

import engine.Coordinates;

public class AI extends Player{

	public AI(String name, GameHistory h) {
		super(name, h);
	}

	@Override
	public void getGameHistory() {
		
	}
	
	public Coordinates getRandomMove() { // for MrBean_AI
		return null; 
		
	}
	
	public Coordinates getBestMove() {	// for Hal_AI
		return null;  
		
	}
	
}
