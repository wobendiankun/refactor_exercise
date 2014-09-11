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
public class TypeA extends Student {


	/**
	 * @param id
	 * @param name
	 */
	public TypeA(int id, String name) {
		super(id, name);
	}

	/* (non-Javadoc)
	 * @see com.refractor.subcode.after.StudentManagement#getType()
	 */
	@Override
	public int getType() {
		return A;
	}

	@Override
	public String toString() {
		return "TypeA [type=" + getType() + ", id=" + getId()
				+ ", name=" + getName() + "]";
	}
	
}
