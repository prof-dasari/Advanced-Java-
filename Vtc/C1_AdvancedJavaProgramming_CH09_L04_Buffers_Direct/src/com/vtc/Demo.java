package com.vtc;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] values = {1, 2, 3};
		
		IntBuffer buffer;
		
		ByteBuffer byteBuffer = ByteBuffer.allocate(64);
		
		byteBuffer.order(ByteOrder.nativeOrder());
		
		buffer = byteBuffer.asIntBuffer();
		
		buffer.put(values);
		
		buffer.position(0);
		
		System.out.println("Location ="+buffer.get(1));
		
		
	}

}
