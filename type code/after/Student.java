package com.demo.refactor.codetype.after;

public class Student {
	private int id;
	private String name;
	private StatusCode code;
	
	public Student(int id, String name, StatusCode code) {
		this.id = id;
		this.name = name;
		this.code = code;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCode() {
		return code.getCode();
	}
	public void setCode(int index) {
		this.code =StatusCode.create(index);
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", code=" + code + "]";
	}
	
}
