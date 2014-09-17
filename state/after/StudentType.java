package com.demo.refactor.state.after;

public abstract class StudentType {
	public abstract int getType();
	public static StudentType create(int type){
		switch (type) {
		case Student.A:
			return new TypeA();
		case Student.B:
			return new TypeB();
		default:
			throw new IllegalArgumentException();
		}
	}
}
