package com.java.prop;

class Employ {
	private int empno;
	private String name;
	private double basic;
	
	public Employ() {

	}

	public Employ(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}

	public int getEmpno() {
		return empno;
	}

	public String getName() {
		return name;
	}

	public double getBasic() {
		return basic;
	}

}

public class PropEx1 {
	public static void main(String[] args) {
		Employ emp1 = new Employ(1, "Manikanta", 92355);
		System.out.println("Employ No   " +emp1.getEmpno());
		System.out.println("Employ Name  " +emp1.getName());
		System.out.println("Basic   " +emp1.getBasic());
	}
}
