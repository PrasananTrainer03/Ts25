package com.java.ex;

public class DivEx {

	public static void main(String[] args) {
		int a,b,c;
		try {
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			c=a/b;
			System.out.println("Division is   " +c);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Arguments are not passed...");
		} catch (ArithmeticException e) {
			System.err.println("Division by zero i");
		} catch (NumberFormatException e) {
			System.err.println("String Cannot be Converted as integer...");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Program from Segue Training...");
		}
	}
}
