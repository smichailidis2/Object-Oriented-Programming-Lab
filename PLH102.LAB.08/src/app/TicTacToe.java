package app;

import control.GameController;
import engine.TttEngine;

public class TicTacToe {
	
	
	public static void main(String[] args) {		
		GameController gc = new GameController(new TttEngine());
		gc.start();
	}
}
