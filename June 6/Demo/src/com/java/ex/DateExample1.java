package com.java.ex;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample1 {

	public void show() {
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(date));
	}
	
	public static void main(String[] args) {
		DateExample1 obj1 = new DateExample1();
		obj1.show();
	}
}
