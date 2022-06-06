package com.java.ex;

public class ArrEx {

	public static void main(String[] args) {
		int[] a = new int[] {12,5};
		try {
			a[10]=4;
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
