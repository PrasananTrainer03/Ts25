package com.java.gen;

import java.util.ArrayList;
import java.util.List;

public class GenExample2 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(new Integer(32));
		numbers.add(new Integer(31));
		numbers.add(new Integer(42));
		numbers.add(new Integer(90));
		numbers.add(new Integer(33));
		numbers.add(new Integer(18));
		int sum=0;
		for (Integer i : numbers) {
			sum+=i;
		}
		System.out.println("Sum is   " +sum);
	}
}
