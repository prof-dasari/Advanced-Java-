import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

@SuppressWarnings(value = { "all" })
public class DatatypesDemo {

	public static void main(String[] args) {

		//Primitive Data
		byte b = 10;
		short s = 10;
		int i = 10;
		long l = 10L;
		float f = 234.5f;
		double d = 123.4;
		char c = 'A';
		boolean bool = true;
		
		//Java Class/Object Types
		Byte myByte = new Byte("10");//Allocating new memory
		Short myShort = new Short(s);//Allocating new memory
		Integer myInteger = Integer.valueOf(i);//uses pool wrappers
		Long myLong;
		Float myFloat;
		Double myDouble;
		Character myChar;
		Boolean myBoolean;
		
		//Atomic Classes
		AtomicInteger atomicInteger = new AtomicInteger();
		AtomicLong atomicLong = new AtomicLong();
		AtomicBoolean atomicBoolean = new AtomicBoolean();
	 	AtomicReference<Integer> atomicReference =  new AtomicReference<Integer>(new Integer(i));
	 	
	 	System.out.println("I love java datatypes +"+myInteger);
	}

}
