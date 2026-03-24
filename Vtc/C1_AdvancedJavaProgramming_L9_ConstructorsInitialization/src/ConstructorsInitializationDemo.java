
public class ConstructorsInitializationDemo {
	
	int x;
	char c;
	ChainingDemo demo;
	
	public ConstructorsInitializationDemo(){
		x = 5;
		c = 'A';
		demo = new ChainingDemo();
	}
	
	public ConstructorsInitializationDemo(int x){
		this.x = x;
	}
	
	public ConstructorsInitializationDemo(ChainingDemo demo){
		this.demo = demo;
	}
	
	/*
	public void print(){
		System.out.println("x="+x);
		System.out.println("c="+c);
		System.out.println("a="+a);
	}*/
	
	public static void main(String[] args) {
		
	}

}
