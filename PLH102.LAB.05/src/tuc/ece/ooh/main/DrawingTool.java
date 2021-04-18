package tuc.ece.ooh.main;

import java.text.DecimalFormat;

import tuc.ece.ooh.model.*;

public class DrawingTool {
	
	protected Shape[] shapes = new Shape[5];

	public static void main(String[] args) {
		
		DrawingTool tool = new DrawingTool();
		
		tool.initShapes();
		
		double totalArea = 0;

		
		
		/*for (Shape s: shapes) {
			s.draw();
			totalArea += s.getArea();
			System.out.println("Area: " + s.getArea());
			System.out.println("....................");
		}
		
		System.out.println("Total Area of Shapes: " + new DecimalFormat("#.###").format(totalArea));
		*/
	}
	
	public void initShapes() {
		
		shapes[0] = new Circle(300,300,"blue", 20);
		shapes[1] = new Square(150,100,"red", 100);
		shapes[2] = new Sphere(150,100,"red", 12);
		shapes[3] = new Rectangle(350,500,"yellow", 100,50);
		shapes[4] = new Rectangle(450,500,"orange", 50,50);		
		
		
	}

}
