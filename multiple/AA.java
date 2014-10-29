
package com.demo.multiple;

/**
 * @author wobendiankun
 *2014-10-29 下午09:51:57
 */
public class AA implements Item {

	@Override
	public ResultCode compete(Item item) {
		return item.eval(this);
	}

	@Override
	public ResultCode eval(AA aa) {
		System.out.print("AA vs AA :");
		return ResultCode.EQ;
	}

	@Override
	public ResultCode eval(BB bb) {
		System.out.print("AA vs BB :");
		return ResultCode.GT;
	}

	@Override
	public ResultCode eval(CC cc) {
		System.out.print("AA vs CC :");
		return ResultCode.LT;
	}

}
