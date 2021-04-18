package engine;

public class Coordinates {
	
	protected int x;
	
	protected int y;
	
	/*
	 * x,y
	 * 
	 * 0,0  |0,1    |0,2
	 *      |       |
	 * --------------------
	 * 1,0  |1,1    |1,2
	 *      |       |
	 *      |       |
	 * --------------------
	 * 2,0  |2,1    |2,2
	 *      |       |
	 * 
	 */
	public Coordinates(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Coordinates() {
		this.x = 0;
		this.y = 0;
	}
}
