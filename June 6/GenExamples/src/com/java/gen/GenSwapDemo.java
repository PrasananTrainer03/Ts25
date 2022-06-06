package com.java.gen;

class Data<T> {
	public void swap(T a, T b) {
		T t;
		t=a;
		a=b;
		b=t;
		System.out.println("A value is  " +a+ " B Value is  " +b);
	}
}

public class GenSwapDemo {
	public static void main(String[] args) {
		Data obj = new Data();
		int a,b;
		a=5;
		b=7;
		obj.swap(a, b);
		String s1="Chandana", s2="Ganesh";
		obj.swap(s1, s2);
		double a1=12.5, b1=5.8;
		obj.swap(a1, b1);
		boolean f1 = true, f2 = false;
		obj.swap(f1, f2);
	}
}
