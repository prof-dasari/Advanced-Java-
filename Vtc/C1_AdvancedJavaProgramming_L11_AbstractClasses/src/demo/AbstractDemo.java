package demo;


public class AbstractDemo {

	public static void main(String[] args) {

		String myShape = "circle";

		ShapeBase shape;

		switch (myShape) {
		case "circle":
			shape = new Circle();
			shape.draw();
			shape.print();
			break;
		case "square":
			shape = new Square();
			shape.draw();
			shape.print();
			break;
		/*case "shape":
			shape = new ShapeBase();
			shape.draw();
			shape.print();
			break;*/
		}

	}

}
