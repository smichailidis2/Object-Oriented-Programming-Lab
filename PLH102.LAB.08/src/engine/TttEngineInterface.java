package engine;

public interface TttEngineInterface {
	
	
	public void initPosition();
	//	Initianlizes all board cells to be empty.

	public void switchPlayer();
	//	Sitches the player after a move is made, so one player cannot make two consecutive moves.

	public boolean playerToMove();
	//	initializes the player who is first to play.

	public void makeMove(Coordinates c);
	/*	Makes a move for the current player/AI selected; Also throws exception finalBoardEXCEPTION if board is final;
	 * 	Throws exception winEVENT if win condition is met;
	 * 	Lastly , checks wether the same player tries to make 2 consecutive moves , throws TttException. 
	 */
	
	public Coordinates getMrBEANmove();
	//	Returns th ecoordinates of the next move player mrBean_AI will make.
	
	public Coordinates getBestmove();
	//	Returns th ecoordinates of the next move player hal_AI will make.
	
	public boolean bestBoard();
	//	Evaluates board every move to avoid illegal boards.

	public boolean isFinalBoard();
	//	Checks if board is final.
	
	
	
	
}
