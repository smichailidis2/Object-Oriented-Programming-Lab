package tuc.ece.ooh.model;

public class Rectangle extends Shape {
	protected int width;
	protected int height;
	
	public Rectangle(int x, int y, String c, int w, int h) {		
		super(x,y,c);
		this.width=w;
		this.height=h;
	}	

	@Override
	public double getArea() {
		return this.width*this.height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public void draw() {
		System.out.println("A Rectangle at " + this.center + " [width:" + this.width+", height:"+this.height+"]");
	}

	@Override
	public int compareTo(Shape o) {
		// TODO Auto-generated method stub
		return 0;
	}
		
}
