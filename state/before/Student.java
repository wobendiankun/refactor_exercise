/**
 * @file Student.java
 * 
 * 
 * @author wumingkun
 * @version 1.0.0
 * @Description
 */

package com.demo.refactor.state.before;

/**
 * @author wumingkun
 *
 */
public class Student {
	private int id;
	private String name;
	private int type;
	public static final int A =1;
	public static final int B =2;
	
	public Student(int id, String name, int type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
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
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
}
