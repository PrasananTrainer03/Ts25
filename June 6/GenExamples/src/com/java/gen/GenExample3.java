package com.java.gen;

import java.util.ArrayList;
import java.util.List;

public class GenExample3 {

	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Ayesha", 93324));
		employList.add(new Employ(2, "Trinath Babu", 93324));
		employList.add(new Employ(3, "Nikitha", 93324));
		employList.add(new Employ(4, "Ramya", 93324));
		employList.add(new Employ(5, "Saritha", 93324));
		employList.add(new Employ(6, "Sumanth", 93324));
		System.out.println("Employ List Records are  ");
		for (Employ e : employList) {
			System.out.println(e);
		}
	}
}
