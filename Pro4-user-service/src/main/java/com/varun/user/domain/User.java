package com.varun.user.domain;

public class User {

	private String userName;
	private String userId;
	private String dname;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public User(String userName, String userId, String dname) {
		super();
		this.userName = userName;
		this.userId = userId;
		this.dname = dname;
	}
	
	
}
