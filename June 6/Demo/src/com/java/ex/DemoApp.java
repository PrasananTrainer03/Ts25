package com.java.ex;

public class DemoApp {

	public void check(int n) {
		if (n < 0) {
			throw new NumberFormatException("Negative Numbers not allowed...");
		} else if (n == 0) {
			throw new ArithmeticException("Zero is Invalid Value...");
		} else {
			System.out.println("N value is   " +n);
		}
	}
	public static void main(String[] args) {
		DemoApp obj = new DemoApp();
		try {
			obj.check(12);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
