package demo;

public class StaticDemo {

	public static void main(String[] args) {
		Widget w1 = new Widget();
		Widget w2 = new Widget();
		
		System.out.printf("How many Widgets are available? %s",Widget.getAvailableWidgets());
	}

}
