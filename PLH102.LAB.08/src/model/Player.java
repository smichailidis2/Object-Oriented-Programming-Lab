package model;

public abstract class Player {
	
	public Player(String name, GameHistory h) {
		this.name = name;
		this.history = h;
	}
	
	protected String name;
	
	protected GameHistory history;
	
	public abstract void getGameHistory();
	
	
	
}
