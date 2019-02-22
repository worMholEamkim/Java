package com.exam.vo;

import java.sql.Timestamp;

// VO (Value Object) : �� ��ü
public class Member {
	private int id;
	private String name;
	private Timestamp regDate;
	
	public Member() { // �⺻������
	}
	
	public Member(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Timestamp getRegDate() {
		return regDate;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", regDate=" + regDate + "]";
	}
	
}
