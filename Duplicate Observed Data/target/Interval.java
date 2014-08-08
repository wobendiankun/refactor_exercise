/**
 
 * @author wumingkun
 * @version 1.0.0
 * @Description
 */

package com.demo.refactor;

import java.util.Observable;
import java.util.Observer;

/**
 * @author wumingkun
 *
 */
public class Interval extends Observable {
	private String begin;
	private String end;
	private String length;
	
	public Interval(String begin, String end, String length) {
		super();
		this.begin = begin;
		this.end = end;
		this.length = length;
	}
	@Override
	public synchronized void addObserver(Observer o) {
		super.addObserver(o);
	}
	public String getBegin() {
		return begin;
	}
	public void setBegin(String begin) {
		this.begin = begin;
		change(1);
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
		change(1);
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
		change(2);
	}
	private  void change(int type) {
		if(type==1){
			calculateLength();
		}else {
			calculateEnd();
		}
		super.setChanged();
		super.notifyObservers();
	}
	/**
	 * 
	 */
	private void calculateEnd() {
		int begin=Integer.parseInt(this.begin);
		int length=Integer.parseInt(this.length);
		int end=length+begin;
		this.end=String.valueOf(end);
	}

	/**
	 * 
	 */
	private void calculateLength() {
		int begin=Integer.parseInt(this.begin);
		int end=Integer.parseInt(this.end);
		int length=end-begin;
		this.length=String.valueOf(length);
	}
}
