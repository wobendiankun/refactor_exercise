package com.demo.refactor.codetype.before;

public class Student {
	private int id;
	private String name;
	/**
	 *状态:0,有效,1无效 
	 */
	private int status ;
	
	public static final int INVALID=0;
	public static final int VALID=1;
	
	public Student(int id, String name, int status) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
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
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", status=" + status
				+ "]";
	}
	
}
