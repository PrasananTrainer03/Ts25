package com.java.ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample2 {

	public void show(String dt) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(dt);
		System.out.println(date);
	}
	
	public static void main(String[] args) {
		String dt="2022-05-31";
		DateExample2 obj = new DateExample2();
		try {
			obj.show(dt);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
