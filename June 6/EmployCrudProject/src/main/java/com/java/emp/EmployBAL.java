package com.java.emp;

import java.util.List;

public class EmployBAL {

	static StringBuilder sb = new StringBuilder();
	static EmployDAO dao = new EmployDAO();
	
	public boolean isValid(Employ employ) {
		boolean flag=true;
		if (employ.getEmpno() < 0) {
			sb.append("Employ No. Cannot be Negative or Zero...\r\n");
			flag=false;
		}
		if (employ.getName().length() < 5) {
			sb.append("Employ name Contains min 5 characters...\r\n");
			flag=false;
		}
		if (employ.getDept().length() < 3) {
			sb.append("Employ Dept. Contains min 3 characters...\r\n");
			flag=false;
		}
		if (employ.getDesig().length() < 3) {
			sb.append("Employ Desig Contains min 3 characters...\r\n");
			flag=false;
		}
		if (employ.getBasic() < 20000 || employ.getBasic() > 90000) {
			sb.append("Employ Basic Must be from 20000 to 90000...\r\n");
			flag=false;
		}
		return flag;
	}
	
	public String addEmployBal(Employ employ) throws EmployException {
		if (isValid(employ)==true) {
			return dao.addEmployDao(employ);
		}
		throw new EmployException(sb.toString());
	}
	public List<Employ> showEmployBAL() {
		return dao.showEmployDao();
	}
}
