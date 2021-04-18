package tuc.ece.ooh.model;

public class Square extends Rectangle{

	public Square(int x, int y, String c, int size) {
		super(x,y,c,size,size);
		
	}
		
	
	@Override	
	public void setWidth(int width) {		
		this.width=width;
		this.height=width;
	}

	@Override
	public void setHeight(int height) {	
		this.height=height;
		this.width=height;		
	}
	
	@Override
	public void draw() {		
		System.out.println("A Square at " + this.center + " [edge:" + this.width+"]");		
	}
		
}
