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
public class MyFrame  {

	private MyText beginField;
	private MyText endField;
	private MyText lengthField;

	public MyFrame(MyText beginField, MyText endField, MyText lengthField) {
		this.beginField = beginField;
		this.endField = endField;
		this.lengthField = lengthField;
	}

	/**
	 * 开始值发生变化
	 */
	private void beginChange() {
		calculateLength();
	}

	/**
	 * 结束值发生变化
	 */
	private void endChange() {
		calculateLength();
	}

	/**
	 * 长度发生变化
	 */
	private void lengthChange() {
		calculateEnd();
	}

	public void onchange(int type) {
		if (type == 1) {
			beginChange();
		} else if (type == 2) {
			endChange();
		} else {
			lengthChange();
		}
	}
	/**
	 * 计算结束的值
	 */
	private void calculateEnd() {
		int begin=Integer.parseInt(this.beginField.getText());
		int length=Integer.parseInt(this.lengthField.getText());
		int end=length+begin;
		this.endField.setText(String.valueOf(end));
	}

	/**
	 *计算长度的值 
	 */
	private void calculateLength() {
		int begin=Integer.parseInt(this.beginField.getText());
		int end=Integer.parseInt(this.endField.getText());
		int length=end-begin;
		lengthField.setText(String.valueOf(length));
	}

}
