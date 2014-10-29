
package com.demo.multiple.enums;

import com.demo.multiple.Item;
import com.demo.multiple.ResultCode;
import static com.demo.multiple.ResultCode.*;
/**
 * @author wobendiankun
 *2014-10-29 下午09:53:26
 */
public class ItemComparator {
	enum ItemCode implements Item2<ItemCode>{
		AA(EQ,GT,LT),
		BB(LT,EQ,LT),
		CC(GT,GT,EQ);
		private ResultCode item1;
		private ResultCode item2;
		private ResultCode item3;
		
		private ItemCode(ResultCode item1, ResultCode item2, ResultCode item3) {
			this.item1 = item1;
			this.item2 = item2;
			this.item3 = item3;
		}

		/* (non-Javadoc)
		 * @see com.demo.multiple.enums.Item2#compete(com.demo.multiple.Item)
		 */
		@Override
		public ResultCode compete(ItemCode code) {
			switch (code) {
				case AA:
					return item1;
				case BB:
					return item2;
				case CC:
					return item3;
			}
			return null;
		}
	}
	public static void main(String[] args) {
		Item2 item1=ItemCode.AA;
		Item2 item2=ItemCode.CC;
		System.out.println("AA vs CC :"+item1.compete(item2));
	}
}
