package com.java.ex;

import java.util.ArrayList;
import java.util.List;

public class ListExample2 {

	public static void main(String[] args) {
		int sum=0;
		List numbers = new ArrayList();
		numbers.add(new Integer(24));
		numbers.add(new Integer(11)); 
		numbers.add(new Integer(19));
		numbers.add(new Integer(15));
		numbers.add(new Integer(28));
		for (Object ob : numbers) {
			sum+=(Integer)ob;
		}
		System.out.println("Sum is   " +sum);
	}
}
