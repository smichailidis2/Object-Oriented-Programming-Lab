package tuc.ece.ooh.model;

public abstract class Shape implements Comparable<Shape> {
	protected Point center;
	protected String color;
	
	public Shape(int x, int y, String c) {
		this.center = new Point(x, y);
		this.color=c;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Point getCenter() {
		return center;
	}
		
	
	public Point getCetner() {
		return center;
	}

	public void setCenter(Point coords) {
		this.center=coords;
	}	
	
	
	
	public abstract double getArea();
	
	public abstract void draw();
		
}
