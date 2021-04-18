package tuc.ece.ooh.model;

public class Circle extends Shape {
	private double radious;

	public Circle(int x, int y, String c, double r) {
		super(x,y,c);
		this.radious = r;
	}


	@Override
	public double getArea() {
		return Math.PI * radious * radious;
	}

	public double getRadious() {
		return radious;
	}

	public void setRadious(double radious) {
		this.radious = radious;
	}	

	public void draw() {
		System.out.println("A Circle at " + this.center + " [radious:" + this.radious + "]");
	}


	@Override
	public int compareTo(Shape o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
