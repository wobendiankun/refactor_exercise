/** 
 * 
 * @author wumingkun
 * @version 1.0.0
 * @Description
 */

package com.demo.refactor;

/**
 * @author wumingkun
 *
 */
public class MyText {
	private String text="0";
	final String name;
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}


	public MyText(String text, String name) {
		super();
		this.text = text;
		this.name = name;
	}

	public MyText( String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "MyText [ name=" + name + " ,text=" + text + "]";
	}

	
}
