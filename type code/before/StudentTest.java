package com.demo.refactor.codetype.before;

public class StudentTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student student=new Student(1, "张三", Student.VALID);
		System.out.println(student);
	}

}
