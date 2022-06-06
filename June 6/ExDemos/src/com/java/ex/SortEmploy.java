package com.java.ex;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {
	public static void main(String[] args) {
	//	Comparator c = new NameComparator();
		Comparator c = new BasicComparator();
		SortedSet employs = new TreeSet(c);
		employs.add(new Employ(1, "Ayesha", 89424));
		employs.add(new Employ(2, "Trinath Babu", 90423));
		employs.add(new Employ(3, "Nikitha", 89032));
		employs.add(new Employ(4, "Ramya", 91143));
		employs.add(new Employ(5, "Saritha", 92904));
		employs.add(new Employ(6, "Sumanth", 96233));
		System.out.println("Employ Records are  ");
		for (Object ob : employs) {
			Employ employ = (Employ)ob;
			System.out.println(employ);
		}
	}
}
