package com.SpringRealtime.CollectionInjection;

import java.util.Date;
import java.util.Map;

public class EmployeeDetails {
	
	private Map<Integer,String> empInfo;
	@Override
	public String toString() {
		return "EmployeeDetails [empInfo=" + empInfo + ", empReg=" + empReg + "]";
	}
	private Map<String,Date> empReg;
	public void setEmpInfo(Map<Integer, String> empInfo) {
		this.empInfo = empInfo;
	}
	public void setEmpReg(Map<String, Date> empReg) {
		this.empReg = empReg;
	}

}
