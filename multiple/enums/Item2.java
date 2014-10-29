
package com.demo.multiple.enums;

import com.demo.multiple.Item;
import com.demo.multiple.ResultCode;
import com.demo.multiple.enums.ItemComparator.ItemCode;

/**
 * @author wobendiankun
 *2014-10-29 下午09:53:15
 * @param <T>
 */
public interface Item2<T extends Item2<T>> {
	ResultCode compete(T code);
}
