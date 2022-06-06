package com.java.prop;

class Emp {

	private int empno;
	private String name;
	private double basic;
	
	public int getEmpno() {
		return empno;
	}
	
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getBasic() {
		return basic;
	}
	
	public void setBasic(double basic) {
		this.basic = basic;
	}
	
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	
}
public class PropEx3 {
	public static void main(String[] args) {
		Emp emp1 = new Emp();
		emp1.setEmpno(1);
		emp1.setName("Manikanta");
		emp1.setBasic(94253);
		System.out.println("Employ Number  " +emp1.getEmpno());
		System.out.println("Employ Name   " +emp1.getName());
		System.out.println("Basic   " +emp1.getBasic());
	}
}
