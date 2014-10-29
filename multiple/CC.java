
package com.demo.multiple;


/**
 * @author wobendiankun
 *2014-10-29 下午09:52:28
 */
public class CC implements Item {
	@Override
	public ResultCode compete(Item item) {
		return item.eval(this);
	}

	@Override
	public ResultCode eval(AA aa) {
		System.out.print("CC vs AA :");
		return ResultCode.GT;
	}

	@Override
	public ResultCode eval(BB bb) {
		System.out.print("CC vs BB :");
		return ResultCode.GT;
	}

	@Override
	public ResultCode eval(CC cc) {
		System.out.print("CC vs CC :");
		return ResultCode.EQ;
	}
}
