package com.java.ex;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortStudent {

	public static void main(String[] args) {
		// Comparator c = new CityComparator();
		Comparator c = new CgpComparator();
		SortedSet students = new TreeSet(c);
		students.add(new Student(1, "Venu", "Tadepalligudem", 9.3));
		students.add(new Student(2, "Chandana", "Hyderabad", 8.7));
		students.add(new Student(3, "Mohit", "Chennai", 9.1));
		students.add(new Student(4, "Lavanya", "Bangalore", 7.8));
		students.add(new Student(5, "Keerthana", "Vijayawada", 8.7));
		students.add(new Student(6, "Saritha", "Kakinada", 8.5));
		
		System.out.println("Students List  ");
		for (Object ob : students) {
			Student student = (Student)ob;
			System.out.println(student);
		}
	}
}
