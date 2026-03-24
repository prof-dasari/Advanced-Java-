package demo;

public abstract class ShapeBase {

	abstract void draw();
	
	abstract void erase();
	
	final void print(){
		System.out.println("a shape"); 
	}
}
