package com.java.ex;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDemo1 {
	public static void main(String[] args) {
		Map data = new HashMap();
		data.put("Likhitha", "Subha");
		data.put("Keerthana", "Mathamsetti");
		data.put("Trinadh", "Babu");
		data.put("Ramya", "Sri");
		String key,value;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Key  ");
		key=sc.next();
		System.out.println("Enter Value   ");
		value=sc.next();
		String result = (String)data.getOrDefault(key, "Not Found");
		if (result.equals(value)) {
			System.out.println("Correct Credentials...");
		} else {
			System.out.println("Invalid Credentials...");
		}
	}
}
