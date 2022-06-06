package com.java.emp;

import java.util.ArrayList;
import java.util.List;

public class EmployDAO {

	static List<Employ> employList;
	
	static {
		employList = new ArrayList<Employ>();
	}
	
	public String addEmployDao(Employ employ) {
		employList.add(employ);
		return "Employ Record Inserted...";
	}
	
	public List<Employ> showEmployDao() {
		return employList;
	}
}
