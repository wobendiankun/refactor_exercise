
package com.demo.multiple;

/**
 * @author wobendiankun
 *2014-10-29 下午09:50:22
 */
public class MultiDispTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Item item1=new BB();
		Item item2=new AA();
		ResultCode result=item1.compete(item2);
		System.out.println("\t"+result);
	}

}
