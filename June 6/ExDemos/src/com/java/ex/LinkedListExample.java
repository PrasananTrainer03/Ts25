package com.java.ex;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList names = new LinkedList();
		names.add("Ganga");
		names.add("Saritha");
		names.add("Likhita");
		names.add("Dhanalakshmi");
		names.add("Chandana");
		names.addFirst("Guru Datta");
		names.addLast("Keerthana");
		System.out.println("Names are  ");
		for (Object ob : names) {
			System.out.println(ob);
		}
	}
}
