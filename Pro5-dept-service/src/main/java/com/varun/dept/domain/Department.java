package com.varun.dept.domain;

public class Department {

	private String deptid;
	private String deptName;
	public String getDeptid() {
		return deptid;
	}
	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Department(String deptid, String deptName) {
		super();
		this.deptid = deptid;
		this.deptName = deptName;
	}
	
	
}
