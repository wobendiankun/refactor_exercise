/**
 * @file Student.java
 * 
 * 
 * @author wumingkun
 * @version 1.0.0
 * @Description
 */

package com.demo.refactor.state.after;

/**
 * @author wumingkun
 *
 */
public abstract class Student {
	private int id;
	private String name;
	public static final int A =1;
	public static final int B =2;
	private StudentType type ;
	public Student(int id, String name,StudentType type) {
		super();
		this.id = id;
		this.name = name;
		this.type=type;
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
	public int getType() {
		return type.getType();
	}
	
	public void setType(int type) {
		//调用工厂方法
		this.type = StudentType.create(type);
	}
	
}
