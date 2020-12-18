package com.model;

public class User {
	private int userid;
	private String uname;
	private String password;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(int userid, String uname, String password) {
		super();
		this.userid = userid;
		this.uname = uname;
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

}
