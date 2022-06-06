package com.java.abs;

abstract class Training {
	public abstract void name();
	public abstract void email();
}

class Ramya extends Training {

	@Override
	public void name() {
		System.out.println("Name is Ramya...");
	}

	@Override
	public void email() {
		System.out.println("Email is ramya@gmail.com");
	}
	
}

class Jyothika extends Training {

	@Override
	public void name() {
		System.out.println("Name is Jyothika...");
	}

	@Override
	public void email() {
		System.out.println("Email is jyothika@gmail.com");
	}
	
}

class Ganesh extends Training {

	@Override
	public void name() {
		System.out.println("Name is Ganesh...");
	}

	@Override
	public void email() {
		System.out.println("Email is ganesh@gmail.com");
	}
	
}

public class AbsDemo {

	public static void main(String[] args) {
		Training[] arr = new Training[] {
			new Ganesh(),
			new Jyothika(),
			new Ramya()
		};
		for (Training t : arr) {
			t.name();
			t.email();
		}
	}
}
