package com.java.gen;

import java.util.ArrayList;
import java.util.List;

public class GenExample1 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Chandana");
		names.add("Ganesh");
		names.add("Ganga");
		names.add("Jnanpaul");
		names.add("Likhitha");
		System.out.println("Names are  ");
		for (String s : names) {
			System.out.println(s);
		}
	}
}
