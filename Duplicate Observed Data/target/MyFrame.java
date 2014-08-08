/**
 * 
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
public class MyFrame implements Observer {
	@Override
	public void update(Observable o, Object arg) {
		this.beginField.setText(subject.getBegin());
		this.endField.setText(subject.getEnd());
		this.lengthField.setText(subject.getLength());
	}

	private MyText beginField;
	private MyText endField;
	private MyText lengthField;
	Interval subject;

	public MyFrame(MyText beginField, MyText endField, MyText lengthField) {
		super();
		this.beginField = beginField;
		this.endField = endField;
		this.lengthField = lengthField;
		subject = new Interval(this.beginField.getText(),
				this.endField.getText(), this.lengthField.getText());
		subject.addObserver(this);
	}

	/**
	 * 
	 */
	private void baginLost() {
		setBegin(beginField.getText());
	}

	/**
	 * 
	 */
	private void endLost() {
		setEnd(endField.getText());
	}

	/**
	 * 
	 */
	private void lengthLost() {
		setLength(lengthField.getText());
	}

	public void onchange(int type) {
		if (type == 1) {
			baginLost();
		} else if (type == 2) {
			endLost();
		} else {
			lengthLost();
		}
	}

	public String getBegin() {
		return this.subject.getBegin();
	}

	public void setBegin(String begin) {
		this.subject.setBegin(begin);
	}

	public String getEnd() {
		return this.subject.getEnd();
	}

	public void setEnd(String end) {
		this.subject.setEnd(end);
	}

	public String getLength() {
		return this.subject.getLength();
	}

	public void setLength(String length) {
		this.subject.setLength(length);
	}
}
