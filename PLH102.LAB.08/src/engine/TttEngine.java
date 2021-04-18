package engine;

import java.util.Random;

public class TttEngine implements TttEngineInterface{
	
	
	private boolean playerThatMovedLast = false;    //1st player ( X ) -> false || 2cond ( O ) player -> true
	
	private Board b = null;
	
	public TttEngine() {
		b = new Board(); //Creates empty board;
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

	
	/*
	 * Ipmlements min - max algorithm...
	 * 
	 * 
	 */
	@Override
	public int bestBoard(boolean player_to_move, int[][] board) {
		
		if (hasPlayerWon(player_to_move) || isFinalBoard()) {
			
		}
		
		
		return 0;
	}

	@Override
	public boolean isFinalBoard() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public static int getRandomValue() {
		return new Random().nextInt(Board.tttDimension + 1);
	}

	
	//returns true if player reached winning position
	//player=FALSE (X player),  player=TRUE (O player),
	private boolean hasPlayerWon(boolean player) {
		
		int cell_val = (player) ? 2 : 1;
		
			return 
				   (b.getCellValue(new Coordinates(0,0) ) == cell_val && b.getCellValue(new Coordinates(0,1) ) == cell_val  && b.getCellValue(new Coordinates(0,2) ) == 1) 
			   ||  (b.getCellValue(new Coordinates(1,0) ) == cell_val && b.getCellValue(new Coordinates(1,1) ) == cell_val  && b.getCellValue(new Coordinates(1,2) ) == 1) 
			   ||  (b.getCellValue(new Coordinates(2,0) ) == cell_val && b.getCellValue(new Coordinates(2,1) ) == cell_val  && b.getCellValue(new Coordinates(2,2) ) == 1) 
			   ||  (b.getCellValue(new Coordinates(0,0) ) == cell_val && b.getCellValue(new Coordinates(1,0) ) == cell_val  && b.getCellValue(new Coordinates(2,0) ) == 1) 
    		   ||  (b.getCellValue(new Coordinates(0,1) ) == cell_val && b.getCellValue(new Coordinates(1,1) ) == cell_val  && b.getCellValue(new Coordinates(2,1) ) == 1) 
	    	   ||  (b.getCellValue(new Coordinates(0,2) ) == cell_val && b.getCellValue(new Coordinates(1,2) ) == cell_val  && b.getCellValue(new Coordinates(2,2) ) == 1) 
	    	   ||  (b.getCellValue(new Coordinates(0,0) ) == cell_val && b.getCellValue(new Coordinates(1,1) ) == cell_val  && b.getCellValue(new Coordinates(2,2) ) == 1)
	    	   ||  (b.getCellValue(new Coordinates(2,0) ) == cell_val && b.getCellValue(new Coordinates(1,1) ) == cell_val  && b.getCellValue(new Coordinates(0,2) ) == 1);
		
	}
	
	
	
	//-----------------------------------
	//Board Inner Class
	//-----------------------------------
	
	private class Board {
		
		public static final int tttDimension = 3;
		
		//0 value ... empty cell
		//1 value ... X cell
		//2 value ... O cell
		private int[][] tttBoard = new int[tttDimension][tttDimension];
		
		private int number_of_free_cells = 9;
		
		//creates empty board
		public Board() {					
			initPosition();
		}
		
		//copies b board
		public Board(Board b) {

			for (int i = 0; i < tttDimension; i++ ) {
				for (int j = 0; j < tttDimension; j++) {
					this.tttBoard[i][j] = b.tttBoard[i][j];
				}
			}
			
			this.number_of_free_cells = b.number_of_free_cells;
			
		}
		

		public void initPosition() {			//board initialization : 0 -> empty || 1 -> X || 2 -> O
			for (int i = 0; i < tttDimension; i++ ) {
				for (int j = 0; j < tttDimension; j++) {
					this.tttBoard[i][j] = 0;
				}
			}
			
			number_of_free_cells = 9;
		}
		
		
		public void setCellValue(Coordinates c, int val) {
			
			this.tttBoard[c.x][c.y] = val;
			
			this.number_of_free_cells--;
		}
		
		public int getCellValue(Coordinates c) {
			
			return this.tttBoard[c.x][c.y];
						
		}
		
	}//Board
	
	
	
	
	
	
}//TttEngine

