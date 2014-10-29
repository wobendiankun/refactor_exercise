
package com.demo.multiple;


/**
 * @author wobendiankun
 *2014-10-29 下午09:52:09
 */
public class BB implements Item {
	@Override
	public ResultCode compete(Item item) {
		return item.eval(this);
	}

	@Override
	public ResultCode eval(AA aa) {
		System.out.print("BB vs AA :");
		return ResultCode.LT;
	}

	@Override
	public ResultCode eval(BB bb) {
		System.out.print("BB vs BB :");
		return ResultCode.EQ;
	}

	@Override
	public ResultCode eval(CC cc) {
		System.out.print("BB vs CC :");
		return ResultCode.LT;
	}
}
