/**
 * 
 * @author wumingkun
 * @version 1.0.0
 * @Description
 */

package com.refractor.subcode.after;

/**
 * @author wumingkun
 *
 */
public class TypeB extends Student {


	/**
	 * @param id
	 * @param name
	 */
	public TypeB(int id, String name) {
		super(id, name);
	}

	/* (non-Javadoc)
	 * @see com.refractor.subcode.after.StudentManagement#getType()
	 */
	@Override
	public int getType() {
		return B;
	}

}
