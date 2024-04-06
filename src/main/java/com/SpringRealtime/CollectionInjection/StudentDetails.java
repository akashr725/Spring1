package com.SpringRealtime.CollectionInjection;

import java.util.Date;
import java.util.Set;

public class StudentDetails {
	
	private Set<Long> studentId;
	private Set<Date> studentRegister;
	public StudentDetails(Set<Long> studentId, Set<Date> studentRegister) {
		super();
		this.studentId = studentId;
		this.studentRegister = studentRegister;
	}
	@Override
	public String toString() {
		return "StudentDetails [studentId=" + studentId + ", studentRegister=" + studentRegister + "]";
	}
	

}
