import java.util.ArrayList;
import java.util.List;

public class Java_Old_Way {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List testList = new ArrayList();
		testList.add(new Integer(6));
		
		String string = (String) testList.get(0);

	}

}
