package com.java.ex;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx {

	public static void main(String[] args) {
		Set names = new LinkedHashSet();
		names.add("Ganga");
		names.add("Saritha");
		names.add("Likhita");
		names.add("Dhanalakshmi");
		names.add("Chandana");
		names.add("Ganga");
		names.add("Saritha");
		names.add("Likhita");
		names.add("Dhanalakshmi");
		names.add("Ganga");
		names.add("Saritha");
		names.add("Likhita");
		names.add("Dhanalakshmi");
		names.add("Ganga");
		names.add("Saritha");
		names.add("Likhita");
		names.add("Dhanalakshmi");
		names.add("Saritha");
		names.add("Likhita");
		names.add("Dhanalakshmi");
		names.add("Chandana");
		names.add("Ganga");
		names.add("Saritha");
		names.add("Likhita");
		names.add("Dhanalakshmi");
		names.add("Chandana");
		names.add("Ganga");
		System.out.println("Names are  ");
		for (Object ob : names) {
			System.out.println(ob);
		}
	}
}
