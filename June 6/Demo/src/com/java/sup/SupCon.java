package com.java.sup;

class Employ {
	
	int empno;
	String name;
	double basic;

	public Employ(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}

	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	
}

class Datta extends Employ {

	public Datta(int empno, String name, double basic) {
		super(empno, name, basic);
	}
	
}

class Ganesh extends Employ {

	public Ganesh(int empno, String name, double basic) {
		super(empno, name, basic);
	}
	
}

class Ayesha extends Employ {

	public Ayesha(int empno, String name, double basic) {
		super(empno, name, basic);
	}
	
}

public class SupCon {

	public static void main(String[] args) {
		Employ[] arr = new Employ[] {
			new Ayesha(1, "Ayesha", 99323),
			new Ganesh(2, "Ganesh", 93214),
			new Datta(3, "Datta", 98932)
		};
		for (Employ e : arr) {
			System.out.println(e);
		}
	}
}
