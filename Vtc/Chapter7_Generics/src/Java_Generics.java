import java.util.ArrayList;
import java.util.List;

public class Java_Generics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> testList = new ArrayList<Integer>();
		testList.add(new Integer(6));
		
		String string = (String)testList.get(0);
	}

}
