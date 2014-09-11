/**
 * @file Student.java
 * 
 * 
 * @author wumingkun
 * @version 1.0.0
 * @Description
 */

package com.refractor.subcode.after;

/**
 * @author wumingkun
 *
 */
public abstract class Student {
	private int id;
	private String name;
	public static final int A =1;
	public static final int B =2;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public static Student create(int type){
		switch (type) {
			case A:
				return new TypeA(1,"张三");
			case B:
				return new TypeB(2,"李四");
	
			default:
				throw new IllegalArgumentException();
		}
	}
	public abstract int getType();
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
	
}
