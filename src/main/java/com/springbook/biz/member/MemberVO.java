package com.springbook.biz.member;

import java.io.Serializable;

public class MemberVO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String password;
	private	String name;
	private String role;
	
	public MemberVO() {}

	public MemberVO(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}

	public MemberVO(String id, String password, String name, String role) {
		this(id,password,name);
		this.role = role;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", password=" + password + ", name=" + name + ", role=" + role + "]";
	}
	
}
