package com.java.ex;

import java.util.ArrayList;
import java.util.List;

public class ListExample1 {

	public static void main(String[] args) {
		List names = new ArrayList();
		names.add("Ayesha");
		names.add("Mohith");
		names.add("Mahathi");
		names.add("Sumanth");
		names.add("Saritha");
		names.add("Dhanalakshmi");
		
		System.out.println("List of Elements are");
		for (Object ob : names) {
			System.out.println(ob);
		}
		
		names.add(2, "Ganesh");
		System.out.println("List of Elements are  ");
		for (Object ob : names) {
			System.out.println(ob);
		}
		
		names.remove("Mahathi");
		System.out.println("List after removing elements  ");
		for (Object ob : names) {
			System.out.println(ob);
		}
	}
}
