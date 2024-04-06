package com.SpringRealtime.CollectionInjection;

import java.util.Date;
import java.util.List;

public class FacultyDetails {
	
	private List<String> facultyName;
	private List<Date> joinDate;
	public void setFacultyName(List<String> facultyName) {
		this.facultyName = facultyName;
	}
	public void setJoinDate(List<Date> joinDate) {
		this.joinDate = joinDate;
	}
	@Override
	public String toString() {
		return "FacultyDetails [facultyName=" + facultyName + ", joinDate=" + joinDate + "]";
	}

}
