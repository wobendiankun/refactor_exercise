package com.demo.refactor.codetype.after;

public class StudentTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student stu=new Student(1, "李四", StatusCode.invalid);
		System.out.println(stu);
	}

}
