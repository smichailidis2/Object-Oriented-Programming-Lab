package engine;

import java.util.Random;

public class TttEngine implements TttEngineInterface{
	
	private static final int tttDimension = 3;
	
	private boolean playerThatMovedLast = false;    //1st player ( X ) -> false || 2cond ( O ) player -> true
	
	private int[][] tttBoard = new int[tttDimension][tttDimension];
	
	private int number_of_free_cells = 9;
	
	
	@Override
	public void initPosition() {			//board initialization : 0 -> empty || 1 -> X || 2 -> O
		for (int i = 0; i < tttDimension; i++ ) {
			for (int j = 0; j < tttDimension; j++) {
				this.tttBoard[i][j] = 0;
			}
		}
		
		number_of_free_cells = 9;
	}

	@Override
	public void switchPlayer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean playerToMove() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void makeMove(Coordinates c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Coordinates getMrBEANmove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Coordinates getBestmove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean bestBoard() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFinalBoard() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public static int getRandomValue() {
		return new Random().nextInt(tttDimension + 1);
	}

}
