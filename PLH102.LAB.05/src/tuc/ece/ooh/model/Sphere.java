package tuc.ece.ooh.model;

public class Sphere extends Circle{

	public Sphere(int x, int y, String c, double r) {
		super(x,y,c,r);
	}
	
	@Override
	public double getArea() {
		return 4*super.getArea();
	}
	
	
	@Override
	public void draw() {
		System.out.println("A Sphere at " + this.center + " [radious:" + this.getRadious() + "]");
	}
}
