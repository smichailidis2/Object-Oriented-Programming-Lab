package model;

public class GameHistory {
	
	public GameHistory (Player p, int numofgames, int wins, int ties) {
		this.player = p;
		this.numOfGames = numofgames;
		this.gameWins = wins;
		this.gameTies = ties;
	}
	
	private Player player;
	private int numOfGames;
	private int gameWins;
	private int gameTies;
	private int gameLosses = numOfGames - (gameWins + gameTies);
	public int score = 50 * (2 * gameWins + gameTies)/numOfGames;

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public int getNumOfGames() {
		return numOfGames;
	}

	public void setNumOfGames(int numOfGames) {
		this.numOfGames = numOfGames;
	}

	public int getGameWins() {
		return gameWins;
	}

	public void setGameWins(int gameWins) {
		this.gameWins = gameWins;
	}

	public int getGameTies() {
		return gameTies;
	}

	public void setGameTies(int gameTies) {
		this.gameTies = gameTies;
	}

	public int getGameLosses() {
		return gameLosses;
	}

	public void setGameLosses(int gameLosses) {
		this.gameLosses = gameLosses;
	}
	
}
