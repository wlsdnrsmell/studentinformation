package com.oopsw.model;

public class Teacher {
	private String id;
	private String pw;
	
	public Teacher(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", pw=" + pw + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	

}
