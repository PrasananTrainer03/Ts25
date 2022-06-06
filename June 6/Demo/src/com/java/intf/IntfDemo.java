package com.java.intf;

interface ITraining {
	void name();
	void email();
}

class Trinadh implements ITraining {

	@Override
	public void name() {
		System.out.println("Name is Trinath...");
	}

	@Override
	public void email() {
		System.out.println("Email is trinath@gmail.com");
	}
	
}

class Ramya implements ITraining {

	@Override
	public void name() {
		System.out.println("Name is Ramya...");
	}

	@Override
	public void email() {
		System.out.println("Email is ramya@gmail.com");
	}
	
}
public class IntfDemo {

	public static void main(String[] args) {
		ITraining[] arr = new ITraining[] {
			new Ramya(), 
			new Trinadh(),
		};
		for (ITraining i : arr) {
			i.name();
			i.email();
		}
	}
}
