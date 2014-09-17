/**
 * 
 * @author wumingkun
 * @version 1.0.0
 * @Description
 */

package com.demo.refactor.state.after;

/**
 * @author wumingkun
 *
 */
public class TypeA extends StudentType {



	/* (non-Javadoc)
	 * @see com.refractor.subcode.after.StudentManagement#getType()
	 */
	@Override
	public int getType() {
		return Student.A;
	}

	@Override
	public String toString() {
		return "TypeA [type=" + getType() + "]";
	}
	
}
