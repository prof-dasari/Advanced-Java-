
public class ArraysDemo {

	public static void main(String[] args) {
		
		int[] c = new int[12];//Primitive Type Array
		
		String[] b = new String[100];//Reference Type Array
		
		int[] myArray;
		myArray = new int[10]; 
		
		int[] array = {10, 20, 30, 40, 50};
		
		for(int counter = 0; counter < array.length; counter++){
			System.out.printf("%5d%8d\n",counter,array[counter]);
		}
		
		/*// output each array element's value*/
		System.out.printf( "%5s%8s\n", "Position", "Value" );
		
		for(int number : array){
			System.out.printf("%13d\n", number);
		}
		
		//System.out.printf( "%13s\n", "Value Only" );
		
	}
}
