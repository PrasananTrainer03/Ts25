package com.java.ex;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortingExaple {

	public static void main(String[] args) {
		SortedSet names = new TreeSet();
		names.add("Ganga");
		names.add("Saritha");
		names.add("Likhita");
		names.add("Dhanalakshmi");
		names.add("Chandana");
		
		System.out.println("Sorted Data is  ");
		for (Object ob : names) {
			System.out.println(ob);
		}
	}
}
