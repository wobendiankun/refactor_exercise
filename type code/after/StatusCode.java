package com.demo.refactor.codetype.after;

public class StatusCode {
	public static final StatusCode invalid=new StatusCode(0);
	public static final StatusCode valid=new StatusCode(1);
	public static final StatusCode[] codes={invalid,valid};
	private int code;
	
	private StatusCode(int code) {
		this.code = code;
	}
	
	/**
	 * @param index 
	 * @return
	 */
	public static StatusCode create(int index){
		return codes[index];
	}
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "StatusCode [code=" + code + "]";
	}
	
}
