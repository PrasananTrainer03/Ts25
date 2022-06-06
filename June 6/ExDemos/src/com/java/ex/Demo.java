package com.java.ex;

public class Demo {

	public void check(int age) throws VotingException {
		if (age < 18) {
			throw new VotingException("You are not elligible for Voting...");
		} else {
			System.out.println("You are Elligible for Voting...");
		}
	}
	
	public static void main(String[] args) {
		int age=18;
		Demo obj = new Demo();
		try {
			obj.check(age);
		} catch (VotingException e) {
			e.printStackTrace();
		}
	}
}
