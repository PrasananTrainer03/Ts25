package com.java.gen;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class GenSort {

	public static void main(String[] args) {
	//	Comparator<Employ> c = new NameComparator();
		Comparator<Employ> c = new BasicComparator();
		SortedSet<Employ> employList = new TreeSet<Employ>(c);
		employList.add(new Employ(1, "Ayesha", 93324));
		employList.add(new Employ(2, "Trinath Babu", 78234));
		employList.add(new Employ(3, "Nikitha", 89142));
		employList.add(new Employ(4, "Ramya", 83352));
		employList.add(new Employ(5, "Saritha", 97324));
		employList.add(new Employ(6, "Sumanth", 89032));
		System.out.println("Employ List Records are  ");
		for (Employ e : employList) {
			System.out.println(e);
		}
	}
}
