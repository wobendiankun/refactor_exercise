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
public class MyFrameTest {
	static MyText begin=new MyText("2","begin");
	static MyText end=new MyText("10","end");
	static MyText length=new MyText("length");
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		m2();
		m3();
	}
	static void m2(){
		MyFrame frame=new MyFrame(begin,end,length);
		end.setText("20");
		frame.onchange(2);
		print();
	}
	static void m3(){
		MyFrame frame=new MyFrame(begin,end,length);
		length.setText("100");
		frame.onchange(3);
		print();
	}
	static void m1(){
		MyFrame frame=new MyFrame(begin,end,length);
		frame.onchange(1);
		print();
	}
	private static void print(){
		System.out.println(begin);
		System.out.println(end);
		System.out.println(length);
		System.out.println("-----------------------------");
	}
}
